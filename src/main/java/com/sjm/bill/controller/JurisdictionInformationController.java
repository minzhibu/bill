package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.mbg.model.JurisdictionInformation;
import com.sjm.bill.server.JurisdictionInformationServer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jurisdictionInformation")
public class JurisdictionInformationController {

    private final JurisdictionInformationServer jurisdictionInformationServer;

    public JurisdictionInformationController(JurisdictionInformationServer jurisdictionInformationServer) {
        this.jurisdictionInformationServer = jurisdictionInformationServer;
    }

    /**
     * 查询节点权限的树形结构
     * @return
     */
    @GetMapping("/")
    public CommonResult selectByTree(){
        return CommonResult.success(jurisdictionInformationServer.selectByTree());
    }

    /**
     * 保存一条节点权限记录
     * @return
     */
    @PostMapping("/")
    public CommonResult postJurisdictionInformation(@RequestBody JurisdictionInformation jurisdictionInformation){
        jurisdictionInformationServer.insert(jurisdictionInformation);
        return CommonResult.success(null);
    }

    /**
     * 修改节点权限
     * @param id
     * @param jurisdictionInformation
     * @return
     */
    @PutMapping("/{id}")
    public CommonResult putJurisdictionInformation(@PathVariable Long id, @RequestBody JurisdictionInformation jurisdictionInformation){
        jurisdictionInformationServer.update(id,jurisdictionInformation);
        return CommonResult.success(null);
    }

    /**
     * 删除节点权限
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public CommonResult deleteJurisdictionInformation(@PathVariable Long id){
        boolean delete = jurisdictionInformationServer.delete(id);
        CommonResult commonResult;
        if(delete){
            commonResult = CommonResult.success(null);
        }else{
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }
}
