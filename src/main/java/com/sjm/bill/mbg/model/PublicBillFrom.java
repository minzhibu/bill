package com.sjm.bill.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@ToString
public class PublicBillFrom implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 东西名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 单价
     *
     * @mbggenerated
     */
    private Double price;

    /**
     * 金额
     *
     * @mbggenerated
     */
    private Double amount;

    /**
     * 主键
     *
     * @mbggenerated
     */
    private String mainId;

    /**
     * 标签
     *
     * @mbggenerated
     */
    private String label;

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

    private static final long serialVersionUID = 1L;

}