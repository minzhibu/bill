package com.sjm.bill.dto;

import com.sjm.bill.mbg.model.UserInformation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class UserInformationDTO extends UserInformation {
    private List<String> roleIdS;

}
