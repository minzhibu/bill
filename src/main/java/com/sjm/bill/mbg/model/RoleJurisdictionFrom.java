package com.sjm.bill.mbg.model;

import java.io.Serializable;

public class RoleJurisdictionFrom implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 角色表的ID
     *
     * @mbggenerated
     */
    private Long roleId;

    /**
     * 权限表的ID
     *
     * @mbggenerated
     */
    private Long jurisdictionId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Long jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", jurisdictionId=").append(jurisdictionId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}