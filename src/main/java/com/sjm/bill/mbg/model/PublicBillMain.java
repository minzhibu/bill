package com.sjm.bill.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class PublicBillMain implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 本次账单名称
     *
     * @mbggenerated
     */
    private String billName;

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
    private String lable;

    /**
     * 总金额
     *
     * @mbggenerated
     */
    private Double totleAmout;

    private static final long serialVersionUID = 1L;


}