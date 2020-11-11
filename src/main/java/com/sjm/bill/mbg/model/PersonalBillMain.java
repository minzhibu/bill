package com.sjm.bill.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class PersonalBillMain implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 标签
     *
     * @mbggenerated
     */
    private String label;

    /**
     * 本次账单的总金额
     *
     * @mbggenerated
     */
    private Double totalAmout;

    /**
     * 本次账单的名称
     *
     * @mbggenerated
     */
    private String billName;

    /**
     * 属于哪个人
     *
     * @mbggenerated
     */
    private String userId;


}