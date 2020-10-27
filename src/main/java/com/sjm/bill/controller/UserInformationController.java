package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.UserInformationDTO;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.server.UserInformationService;
import com.sjm.bill.server.impl.FileServiceImpl;
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
    public CommonResult insert( @RequestBody UserInformationDTO userInformationDTO){
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

    /**
     * 根据用户id查询用户对应的角色
     * @param id 用户id
     * @return
     */
    @GetMapping("/selectByIdToRole/{id}")
    public CommonResult selectByIdToRole(@PathVariable Long id){
        return CommonResult.success( userInformationService.selectByIdToRole(id));
    }

}
