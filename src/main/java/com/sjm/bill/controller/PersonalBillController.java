package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.dto.PersonalBillDTO;
import com.sjm.bill.server.PersonalBillService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personalBill")
public class PersonalBillController {
    private final PersonalBillService personalBillService;

    public PersonalBillController(PersonalBillService personalBillService) {
        this.personalBillService = personalBillService;
    }

    @PostMapping("/")
    public CommonResult insert(@RequestBody PersonalBillDTO personalBillDTO){
        if(personalBillService.insert(personalBillDTO)){
            return CommonResult.success(null);
        }else{
            return CommonResult.validateFailed();
        }

    }

}
