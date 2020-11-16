package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.dto.PersonalBillDTO;
import com.sjm.bill.dto.PublicBillDTO;
import com.sjm.bill.server.PublicBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publicBill")
public class PublicBillController {

    private final PublicBillService publicBillService;

    public PublicBillController(PublicBillService publicBillService) {
        this.publicBillService = publicBillService;
    }


    @PostMapping("/")
    public CommonResult insert(@RequestBody PublicBillDTO publicBillDTO){
        if(publicBillService.insert(publicBillDTO)){
            return CommonResult.success(null);
        }else{
            return CommonResult.validateFailed();
        }

    }

}
