package com.group2.store.store.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TOrderItem)实体类
 *
 * @author makejava
 * @since 2022-06-27 15:37:28
 */
public class TOrderItem implements Serializable {
    private static final long serialVersionUID = 940198077947377435L;
    /**
     * ?????е???Ʒ??¼??id
     */
    private Integer id;
    /**
     * ???????Ķ?????id
     */
    private Integer oid;
    /**
     * ??Ʒ??id
     */
    private Integer pid;
    /**
     * ??Ʒ???
     */
    private String title;
    /**
     * ??ƷͼƬ
     */
    private String image;
    /**
     * ??Ʒ?۸
     */
    private Long price;
    /**
     * ?????
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

