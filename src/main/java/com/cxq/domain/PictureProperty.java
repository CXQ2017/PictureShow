package com.cxq.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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
    @NotEmpty(message="病案号不能为空")
    private String card_medical;

    //姓名
    @NotEmpty(message="姓名不能为空")
    private String name;

    //出院次数
    private String times_hospitalized;
    //性别
    private String gender;  // 1、男   2、女

    //身份证
    private String identity_card;

    //主要诊断
    private String principal_diagnosis;

    //模块标记
    private String  case_module;

    //图片地址
    private String picture_path;

    //创建时间
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date creatTime;

    //导入后的status默认为0，标记后为1
    private int status;

    //唯一id
    private String keyword;

    //user_id
    private Long user_id;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public PictureProperty(){super();}


    public PictureProperty(String card_medical, String name, String times_hospitalized, String gender, String identity_card, String principal_diagnosis, String case_module, String picture_path, Date creatTime, int status, String keyword) {
        this.card_medical = card_medical;
        this.name = name;
        this.times_hospitalized = times_hospitalized;
        this.gender = gender;
        this.identity_card = identity_card;
        this.principal_diagnosis = principal_diagnosis;
        this.case_module = case_module;
        this.picture_path = picture_path;
        this.creatTime = creatTime;
        this.status = status;
        this.keyword = keyword;
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

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimes_hospitalized() {
        return times_hospitalized;
    }

    public void setTimes_hospitalized(String times_hospitalized) {
        this.times_hospitalized = times_hospitalized;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getPrincipal_diagnosis() {
        return principal_diagnosis;
    }

    public void setPrincipal_diagnosis(String principal_diagnosis) {
        this.principal_diagnosis = principal_diagnosis;
    }

    public String getCase_module() {
        return case_module;
    }

    public void setCase_module(String case_module) {
        this.case_module = case_module;
    }
}
