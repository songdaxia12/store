package com.group2.store.store.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TOrder)实体类
 *
 * @author makejava
 * @since 2022-06-27 15:37:27
 */
public class TOrder implements Serializable {
    private static final long serialVersionUID = 642523807756307504L;
    /**
     * ????id
     */
    private Integer oid;
    /**
     * ?û?id
     */
    private Integer uid;
    /**
     * ?ջ??????
     */
    private String recvName;
    /**
     * ?ջ??˵绰
     */
    private String recvPhone;
    /**
     * ?ջ???????ʡ
     */
    private String recvProvince;
    /**
     * ?ջ????????
     */
    private String recvCity;
    /**
     * ?ջ????????
     */
    private String recvArea;
    /**
     * ?ջ???ϸ??ַ
     */
    private String recvAddress;
    /**
     * ?ܼ
     */
    private Long totalPrice;
    /**
     * ״̬??0-δ֧????1-??֧????2-??ȡ????3-?ѹرգ?4-?????
     */
    private Integer status;
    /**
     * ?µ?ʱ?
     */
    private Date orderTime;
    /**
     * ֧??ʱ?
     */
    private Date payTime;
    /**
     * ?????
     */
    private String createdUser;
    /**
     * ????ʱ?
     */
    private Date createdTime;
    /**
     * ?޸??
     */
    private String modifiedUser;
    /**
     * ?޸?ʱ?
     */
    private Date modifiedTime;


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRecvName() {
        return recvName;
    }

    public void setRecvName(String recvName) {
        this.recvName = recvName;
    }

    public String getRecvPhone() {
        return recvPhone;
    }

    public void setRecvPhone(String recvPhone) {
        this.recvPhone = recvPhone;
    }

    public String getRecvProvince() {
        return recvProvince;
    }

    public void setRecvProvince(String recvProvince) {
        this.recvProvince = recvProvince;
    }

    public String getRecvCity() {
        return recvCity;
    }

    public void setRecvCity(String recvCity) {
        this.recvCity = recvCity;
    }

    public String getRecvArea() {
        return recvArea;
    }

    public void setRecvArea(String recvArea) {
        this.recvArea = recvArea;
    }

    public String getRecvAddress() {
        return recvAddress;
    }

    public void setRecvAddress(String recvAddress) {
        this.recvAddress = recvAddress;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}

