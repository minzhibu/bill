package com.sjm.bill.server.impl;

import com.sjm.bill.common.StringCommon;
import com.sjm.bill.dto.PersonalBillDTO;
import com.sjm.bill.mbg.model.PersonalBillFrom;
import com.sjm.bill.server.PersonalBillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalBillServiceImpl implements PersonalBillService {
    @Override
    public boolean insert(PersonalBillDTO personalBillDTO) {
        if(!isParameterMethod(personalBillDTO)){
            return false;
        }
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
        if(StringCommon.isNotEmpty(personalBillDTO.getBillName()) && StringCommon.isNotEmpty(personalBillDTO.getLabel())
                && personalBillDTO.getUserId() == null){
            return false;
        }
        List<PersonalBillFrom> personalBillFromList = personalBillDTO.getPersonalBillFromList();
        for (PersonalBillFrom personalBillFrom : personalBillFromList) {
            if (StringCommon.isNotEmpty(personalBillFrom.getLabel()) && StringCommon.isNotEmpty(personalBillFrom.getName())
                    && personalBillFrom.getAmount() == 0 && personalBillFrom.getPrice() == null) {
                return false;
            }
        }
        return true;
    }
}
