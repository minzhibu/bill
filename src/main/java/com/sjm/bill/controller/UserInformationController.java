package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.UserInformationDTO;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.server.UserInformationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserInformationController {

    private final UserInformationService userInformationService;

    public UserInformationController(UserInformationService userInformationService) {
        this.userInformationService = userInformationService;
    }

    @GetMapping("/{page}/{size}")
    public CommonResult selectAll(@PathVariable int page, @PathVariable int size){
        PaginationDTO<UserInformation> roleInformationPaginationDTO = userInformationService.selectPage(page, size);
        return CommonResult.success(roleInformationPaginationDTO);
    }

    @PostMapping("/")
    public CommonResult insert(@RequestBody UserInformationDTO userInformationDTO){
        userInformationService.insert(userInformationDTO);
        return CommonResult.success(null);
    }

    @PutMapping("/{id}")
    public CommonResult update(@PathVariable Long id,@RequestBody UserInformationDTO userInformationDTO){
        userInformationService.update(id,userInformationDTO);
        return CommonResult.success(null);
    }

    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable Long id){
        userInformationService.delete(id);
        return CommonResult.success(null);
    }

}
