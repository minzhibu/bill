package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.mbg.model.JurisdictionInformation;
import com.sjm.bill.server.JurisdictionInformationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jurisdictionInformation")
public class JurisdictionInformationController {

    private final JurisdictionInformationService jurisdictionInformationService;

    public JurisdictionInformationController(JurisdictionInformationService jurisdictionInformationService) {
        this.jurisdictionInformationService = jurisdictionInformationService;
    }

    /**
     * 查询节点权限的树形结构
     * @return
     */
    @GetMapping("/")
    public CommonResult selectByTree(){
        return CommonResult.success(jurisdictionInformationService.selectByTree());
    }

    /**
     * 保存一条节点权限记录
     * @return
     */
    @PostMapping("/")
    public CommonResult postJurisdictionInformation(@RequestBody JurisdictionInformation jurisdictionInformation){
        jurisdictionInformationService.insert(jurisdictionInformation);
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
        jurisdictionInformationService.update(id,jurisdictionInformation);
        return CommonResult.success(null);
    }

    /**
     * 删除节点权限
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public CommonResult deleteJurisdictionInformation(@PathVariable Long id){
        boolean delete = jurisdictionInformationService.delete(id);
        CommonResult commonResult;
        if(delete){
            commonResult = CommonResult.success(null);
        }else{
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }
}
