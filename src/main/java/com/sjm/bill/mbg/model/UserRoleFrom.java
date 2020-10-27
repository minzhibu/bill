package com.sjm.bill.mbg.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class UserRoleFrom implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 用户表的ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 角色表的ID
     *
     * @mbggenerated
     */
    private String roleId;

    private static final long serialVersionUID = 1L;


}