package com.group2.store.store.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TCart)实体类
 *
 * @author makejava
 * @since 2022-06-27 15:37:26
 */
public class TCart implements Serializable {
    private static final long serialVersionUID = -66229141969301083L;
    /**
     * ???ﳵ????id
     */
    private Integer cid;
    /**
     * ?û?id
     */
    private Integer uid;
    /**
     * ??Ʒid
     */
    private Integer pid;
    /**
     * ????ʱ??Ʒ???
     */
    private Long price;
    /**
     * ??Ʒ?
     */
    private Integer num;
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


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

