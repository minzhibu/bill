package com.sjm.bill.dto;

import com.sjm.bill.mbg.model.PersonalBillFrom;
import com.sjm.bill.mbg.model.PersonalBillMain;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PersonalBillDTO extends PersonalBillMain {
    private List<PersonalBillFrom> personalBillFromList;
}
