package com.sjm.bill.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PersonalBillMain implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

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
    private Long userId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getTotalAmout() {
        return totalAmout;
    }

    public void setTotalAmout(Double totalAmout) {
        this.totalAmout = totalAmout;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", label=").append(label);
        sb.append(", totalAmout=").append(totalAmout);
        sb.append(", billName=").append(billName);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}