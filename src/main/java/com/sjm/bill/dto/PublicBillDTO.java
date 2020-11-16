package com.sjm.bill.dto;

import com.sjm.bill.mbg.model.PublicBillFrom;
import com.sjm.bill.mbg.model.PublicBillMain;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PublicBillDTO extends PublicBillMain {
    private List<PublicBillFrom> publicBillFromList;
    private List<String> userIds;
}
