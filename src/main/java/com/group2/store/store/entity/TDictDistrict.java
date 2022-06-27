package com.group2.store.store.entity;

import java.io.Serializable;

/**
 * (TDictDistrict)实体类
 *
 * @author makejava
 * @since 2022-06-27 15:37:27
 */
public class TDictDistrict implements Serializable {
    private static final long serialVersionUID = 813003589198512069L;

    private Integer id;

    private String parent;

    private String code;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

