package com.sjm.bill.dto;

import com.sjm.bill.mbg.model.RoleInformation;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 角色的DTO对象
 */
@Data
@ToString
public class RoleInformationDTO extends RoleInformation {
    //关联权限的id
    private List<String> authoritys;
}
