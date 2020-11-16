package com.sjm.bill.server.impl;

import com.sjm.bill.common.StringCommon;
import com.sjm.bill.dto.PersonalBillDTO;
import com.sjm.bill.mbg.mapper.PersonalBillFromMapper;
import com.sjm.bill.mbg.mapper.PersonalBillMainMapper;
import com.sjm.bill.mbg.model.PersonalBillFrom;
import com.sjm.bill.mbg.model.PersonalBillMain;
import com.sjm.bill.server.PersonalBillService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PersonalBillServiceImpl implements PersonalBillService {

    private final PersonalBillMainMapper personalBillMainMapper;
    private final PersonalBillFromMapper personalBillFromMapper;

    public PersonalBillServiceImpl(PersonalBillMainMapper personalBillMainMapper, PersonalBillFromMapper personalBillFromMapper) {
        this.personalBillMainMapper = personalBillMainMapper;
        this.personalBillFromMapper = personalBillFromMapper;
    }

    /**
     * 保存
     * @param personalBillDTO
     * @return
     */
    @Override
    @Transactional
    public boolean insert(PersonalBillDTO personalBillDTO) {
        //参数校验
        if(!isParameterMethod(personalBillDTO)){
            return false;
        }
        //保存数据
        String mainId = UUID.randomUUID().getMostSignificantBits() + "";
        PersonalBillMain personalBillMain = new PersonalBillMain();
        personalBillMain.setBillName(personalBillDTO.getBillName());
        personalBillMain.setLabel(personalBillDTO.getLabel());
        personalBillMain.setTotalAmout(personalBillDTO.getTotalAmout());
        personalBillMain.setUserId(personalBillDTO.getUserId());
        personalBillMain.setCreateTime(new Date());
        personalBillMain.setUpdateTime(new Date());
        personalBillMain.setId(mainId);
        List<PersonalBillFrom> personalBillFroms = personalBillDTO.getPersonalBillFromList();
        for(PersonalBillFrom personalBillFrom : personalBillFroms){
            personalBillFrom.setCreateTime(new Date());
            personalBillFrom.setId(UUID.randomUUID().getMostSignificantBits() + "");
            personalBillFrom.setMainId(mainId);
            personalBillFrom.setName(personalBillDTO.getBillName());
            personalBillFrom.setUpdateTime(new Date());
        }
        personalBillMainMapper.insert(personalBillMain);
        personalBillFromMapper.insertBatch(personalBillFroms);
        return true;
    }


    /**
     * 效验个人账单的参数
     * @param personalBillDTO
     * @return
     */
    private boolean isParameterMethod(PersonalBillDTO personalBillDTO){
        if(personalBillDTO == null){
            return false;
        }
        if(!StringCommon.isNotEmpty(personalBillDTO.getBillName()) || !StringCommon.isNotEmpty(personalBillDTO.getLabel())
                || personalBillDTO.getUserId() == null){
            return false;
        }
        List<PersonalBillFrom> personalBillFromList = personalBillDTO.getPersonalBillFromList();
        for (PersonalBillFrom personalBillFrom : personalBillFromList) {
            if (!StringCommon.isNotEmpty(personalBillFrom.getLabel()) || !StringCommon.isNotEmpty(personalBillFrom.getName())
                    || personalBillFrom.getAmount() == null || personalBillFrom.getPrice() == null) {
                return false;
            }
        }
        return true;
    }
}
