package com.sjm.bill.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@ToString
public class UserInformation implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 用户姓名
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 用户登录名
     *
     * @mbggenerated
     */
    private String accountNumber;

    /**
     * 用户密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 用户头像地址
     *
     * @mbggenerated
     */
    private String imgAddress;

    /**
     * 用户状态 0-启用 1-注销
     *
     * @mbggenerated
     */
    private Long state;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    private Date updateTime;

    /**
     * 是否为系统默认人员，为默认则不允许修改
     *
     * @mbggenerated
     */
    private Integer defaultUser;

    /**
     * 预留字段
     *
     * @mbggenerated
     */
    private String ext1;

    private static final long serialVersionUID = 1L;


}