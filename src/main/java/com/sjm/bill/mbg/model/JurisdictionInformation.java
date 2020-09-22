package com.sjm.bill.mbg.model;

import java.io.Serializable;

public class JurisdictionInformation implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 权限结点名称
     *
     * @mbggenerated
     */
    private String jurisdictionName;

    /**
     * 结点的父结点ID 为-1时为根结点
     *
     * @mbggenerated
     */
    private Long parentNodeId;

    /**
     * 除了管理员外是否允许修改 0-不允许 1-允许
     *
     * @mbggenerated
     */
    private Integer isModify;

    /**
     * 结点关联的URL
     *
     * @mbggenerated
     */
    private String link;

    /**
     * 图标
     *
     * @mbggenerated
     */
    private String labelName;

    private Boolean isShow;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public Integer getIsModify() {
        return isModify;
    }

    public void setIsModify(Integer isModify) {
        this.isModify = isModify;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jurisdictionName=").append(jurisdictionName);
        sb.append(", parentNodeId=").append(parentNodeId);
        sb.append(", isModify=").append(isModify);
        sb.append(", link=").append(link);
        sb.append(", labelName=").append(labelName);
        sb.append(", isShow=").append(isShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}