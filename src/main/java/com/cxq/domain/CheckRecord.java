package com.cxq.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/11/011
 *
 * 病程记录中的医生查房记录
 */
@Entity
@Table(name = "check_record")
public class CheckRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//根据数据库的Identity字段生成
 // @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    //病案号
    private String card_medical;
    //病程记录表的主键,可做外键关联
    private Integer bc_id;
    //查房时间
    private Date Patient_rounds_date;
    //查房医师
    private String Patient_rounds_doctor;
    //查房详情记录
    private String Patient_rounds_details;
    //医师签名
    private String doctor_signature;
    //状态
    private String status;
    //创建时间
    private String create_date;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public Integer getBc_id() {
        return bc_id;
    }

    public void setBc_id(Integer bc_id) {
        this.bc_id = bc_id;
    }

    public Date getPatient_rounds_date() {
        return Patient_rounds_date;
    }

    public void setPatient_rounds_date(Date patient_rounds_date) {
        Patient_rounds_date = patient_rounds_date;
    }

    public String getPatient_rounds_doctor() {
        return Patient_rounds_doctor;
    }

    public void setPatient_rounds_doctor(String patient_rounds_doctor) {
        Patient_rounds_doctor = patient_rounds_doctor;
    }

    public String getPatient_rounds_details() {
        return Patient_rounds_details;
    }

    public void setPatient_rounds_details(String patient_rounds_details) {
        Patient_rounds_details = patient_rounds_details;
    }

    public String getDoctor_signature() {
        return doctor_signature;
    }

    public void setDoctor_signature(String doctor_signature) {
        this.doctor_signature = doctor_signature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }
}
