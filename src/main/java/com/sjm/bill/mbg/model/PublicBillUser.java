package com.sjm.bill.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class PublicBillUser implements Serializable {
    private String id;

    private String userId;

    private String publicBillId;

    private static final long serialVersionUID = 1L;


}