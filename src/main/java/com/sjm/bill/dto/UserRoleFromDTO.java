package com.sjm.bill.dto;

import com.sjm.bill.mbg.model.RoleInformation;
import com.sjm.bill.mbg.model.UserRoleFrom;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class UserRoleFromDTO extends UserRoleFrom {
    private RoleInformation roleInformation;
}
