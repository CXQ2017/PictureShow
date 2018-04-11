package com.cxq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/3/2.
 */

@Entity
@Table(name = "picture_property")
public class PictureProperty {

    @Id
    @GeneratedValue
    private Long id;

    //唯一id
    private Long only_id;

    //姓名
    private String name;

    //性别
    private Integer gender;  // 1、男   2、女

    //身份证
    private Integer identity_card;

    //主要诊断
    private String principal_diagnosis;

    //模块
    private Long  case_module;

    //图片地址
    private String picture_path;


    public PictureProperty(){super();}

    public PictureProperty(Long only_id, String name, Integer gender, Integer identity_card, String principal_diagnosis, Long case_module, String picture_path) {
        this.only_id = only_id;
        this.name = name;
        this.gender = gender;
        this.identity_card = identity_card;
        this.principal_diagnosis = principal_diagnosis;
        this.case_module = case_module;
        this.picture_path = picture_path;
    }

    public String getPicture_path() {
        return picture_path;
    }

    public void setPicture_path(String picture_path) {
        this.picture_path = picture_path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOnly_id() {
        return only_id;
    }

    public void setOnly_id(Long only_id) {
        this.only_id = only_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(Integer identity_card) {
        this.identity_card = identity_card;
    }

    public String getPrincipal_diagnosis() {
        return principal_diagnosis;
    }

    public void setPrincipal_diagnosis(String principal_diagnosis) {
        this.principal_diagnosis = principal_diagnosis;
    }

    public Long getCase_module() {
        return case_module;
    }

    public void setCase_module(Long case_module) {
        this.case_module = case_module;
    }
}
