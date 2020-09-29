package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.common.ResultCode;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.server.RoleInformationServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleInformationController {

    private final RoleInformationServer roleInformationServer;

    public RoleInformationController(RoleInformationServer roleInformationServer) {
        this.roleInformationServer = roleInformationServer;
    }

    @GetMapping("/")
    public CommonResult selectAll(int page, int size){
        PaginationDTO<RoleInformation> roleInformationPaginationDTO = roleInformationServer.selectPage(page, size);
        return CommonResult.success(roleInformationPaginationDTO);
    }

    @PostMapping("/")
    public CommonResult insert(RoleInformation roleInformation){
        roleInformationServer.insert(roleInformation);
        return CommonResult.success(null);
    }

    @PutMapping("/{id}")
    public CommonResult update(@PathVariable Long id, RoleInformation roleInformation){
        roleInformationServer.update(id,roleInformation);
        return CommonResult.success(null);
    }

    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable Long id){
        roleInformationServer.delete(id);
        return CommonResult.success(null);
    }

}
