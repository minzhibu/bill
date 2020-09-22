package com.sjm.bill.mbg.model;

import java.io.Serializable;

public class PublicBillUser implements Serializable {
    private Long id;

    private Long userId;

    private Long publicBillId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPublicBillId() {
        return publicBillId;
    }

    public void setPublicBillId(Long publicBillId) {
        this.publicBillId = publicBillId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", publicBillId=").append(publicBillId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}