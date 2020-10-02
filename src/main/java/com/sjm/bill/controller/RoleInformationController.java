package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.dto.JurisdictionInformationDTO;
import com.sjm.bill.dto.PaginationDTO;
import com.sjm.bill.dto.RoleInformationDTO;
import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.server.RoleInformationServer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleInformationController {

    private final RoleInformationServer roleInformationServer;

    public RoleInformationController(RoleInformationServer roleInformationServer) {
        this.roleInformationServer = roleInformationServer;
    }

    @GetMapping("/{page}/{size}")
    public CommonResult selectAll(@PathVariable int page, @PathVariable int size){
        PaginationDTO<RoleInformation> roleInformationPaginationDTO = roleInformationServer.selectPage(page, size);
        return CommonResult.success(roleInformationPaginationDTO);
    }

    @PostMapping("/")
    public CommonResult insert(@RequestBody RoleInformationDTO roleInformationDTO){
        roleInformationServer.insert(roleInformationDTO);
        return CommonResult.success(null);
    }

    @PutMapping("/{id}")
    public CommonResult update(@PathVariable Long id,@RequestBody RoleInformationDTO roleInformationDTO){
        roleInformationServer.update(id,roleInformationDTO);
        return CommonResult.success(null);
    }

    @DeleteMapping("/{id}")
    public CommonResult delete(@PathVariable Long id){
        roleInformationServer.delete(id);
        return CommonResult.success(null);
    }

    @GetMapping("/selectByIdToJurisdiction/{id}")
    public CommonResult selectByIdToJurisdiction(@PathVariable Long id){
        List<JurisdictionInformationDTO> jurisdictionInformationDTOS = roleInformationServer.selectByIdToJurisdiction(id);
        return CommonResult.success(jurisdictionInformationDTOS);
    }
}
