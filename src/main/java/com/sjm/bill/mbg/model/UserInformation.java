package com.sjm.bill.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UserInformation implements Serializable {
    /**
     * 主键
     *
     * @mbggenerated
     */
    private Long id;

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
    private Long imgAddress;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(Long imgAddress) {
        this.imgAddress = imgAddress;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
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

    public Integer getDefaultUser() {
        return defaultUser;
    }

    public void setDefaultUser(Integer defaultUser) {
        this.defaultUser = defaultUser;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append(", password=").append(password);
        sb.append(", imgAddress=").append(imgAddress);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", defaultUser=").append(defaultUser);
        sb.append(", ext1=").append(ext1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}