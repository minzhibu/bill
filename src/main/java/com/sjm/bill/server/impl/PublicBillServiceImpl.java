package com.sjm.bill.server.impl;

import com.sjm.bill.common.StringCommon;
import com.sjm.bill.dto.PersonalBillDTO;
import com.sjm.bill.dto.PublicBillDTO;
import com.sjm.bill.mbg.mapper.*;
import com.sjm.bill.mbg.model.*;
import com.sjm.bill.server.PersonalBillService;
import com.sjm.bill.server.PublicBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class PublicBillServiceImpl implements PublicBillService {

    private final PublicBillMainMapper publicBillMainMapper;
    private final PublicBillUserMapper publicBillUserMapper;
    private final PublicBillFromMapper publicBillFromMapper;

    public PublicBillServiceImpl(PublicBillMainMapper publicBillMainMapper, PublicBillUserMapper publicBillUserMapper, PublicBillFromMapper publicBillFromMapper) {
        this.publicBillMainMapper = publicBillMainMapper;
        this.publicBillUserMapper = publicBillUserMapper;
        this.publicBillFromMapper = publicBillFromMapper;
    }

    /**
     * 保存
     * @param PublicBillDTO
     * @return
     */
    @Override
    @Transactional
    public boolean insert(PublicBillDTO publicBillDTO) {
        //参数校验
        if(!isParameterMethod(publicBillDTO)){
            return false;
        }
        //保存数据
        String mainId = UUID.randomUUID().getMostSignificantBits() + "";
        PublicBillMain publicBillMain = new PublicBillMain();
        publicBillMain.setBillName(publicBillDTO.getBillName());
        publicBillMain.setLable(publicBillDTO.getLable());
        publicBillMain.setTotleAmout(publicBillDTO.getTotleAmout());
        publicBillMain.setCreateTime(new Date());
        publicBillMain.setUpdateTime(new Date());
        publicBillMain.setId(mainId);
        List<PublicBillFrom> publicBillFromList = publicBillDTO.getPublicBillFromList();
        for(PublicBillFrom publicBillFrom : publicBillFromList){
            publicBillFrom.setCreateTime(new Date());
            publicBillFrom.setId(UUID.randomUUID().getMostSignificantBits() + "");
            publicBillFrom.setMainId(mainId);
            publicBillFrom.setName(publicBillDTO.getBillName());
            publicBillFrom.setUpdateTime(new Date());
        }
        List<String> userIds = publicBillDTO.getUserIds();
        List<PublicBillUser> billUsers = new ArrayList<>();
        for(String userId : userIds){
            PublicBillUser publicBillUser = new PublicBillUser();
            publicBillUser.setId(UUID.randomUUID().getLeastSignificantBits() + "");
            publicBillUser.setPublicBillId(mainId);
            publicBillUser.setUserId(userId);
            billUsers.add(publicBillUser);
        }
        publicBillMainMapper.insert(publicBillMain);
        publicBillFromMapper.insertBatch(publicBillFromList);
        publicBillUserMapper.insertBatch(billUsers);
        return true;
    }


    /**
     * 效验个人账单的参数
     * @param personalBillDTO
     * @return
     */
    private boolean isParameterMethod(PublicBillDTO publicBillDTO){
        if(publicBillDTO == null){
            return false;
        }
        if(!StringCommon.isNotEmpty(publicBillDTO.getBillName()) || !StringCommon.isNotEmpty(publicBillDTO.getLable())){
            return false;
        }
        List<PublicBillFrom> publicBillFromList = publicBillDTO.getPublicBillFromList();
        for (PublicBillFrom publicBillFrom : publicBillFromList) {
            if (!StringCommon.isNotEmpty(publicBillFrom.getLabel()) || !StringCommon.isNotEmpty(publicBillFrom.getName())
                    || publicBillFrom.getAmount() == null || publicBillFrom.getPrice() == null) {
                return false;
            }
        }
        List<String> userIds = publicBillDTO.getUserIds();
        return userIds != null && userIds.size() != 0;
    }
}
