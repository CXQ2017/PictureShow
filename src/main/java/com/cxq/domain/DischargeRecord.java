package com.cxq.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/11/011.
 *
 * 出院记录表
 */
@Entity
@Table(name = "discharge_record")
public class DischargeRecord {
    @Id
    @GeneratedValue
    private  Integer id;
    //科室
    private String department;
    //床号
    private String bed_no;
    //记录日期
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date record_date;
    //病案号
    private String card_medical;
    //入院日期
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private  Date admission_date;
    //出院日期
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date discharge_date;
    //入院情况
    @Column(columnDefinition="TEXT")
    private String admitting_situation;
    //入院诊断
    @Column(columnDefinition="TEXT")
    private String admitting_diagnosis;
    //诊疗经过
    @Column(columnDefinition="TEXT")
    private String treatment_process;
    //出院诊断
    @Column(columnDefinition="TEXT")
    private String discharge_diagnosis;
    //出院情况
    @Column(columnDefinition="TEXT")
    private String discharge_situation;
    //出院医嘱
    @Column(columnDefinition="TEXT")
    private String discharge_advice;
    //医师签名
    private String physician_signature;
    //状态
    private Integer status;
    //创建日期
    private Date create_date;

    public DischargeRecord(){
        this.status=0;
        this.create_date=new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBed_no() {
        return bed_no;
    }

    public void setBed_no(String bed_no) {
        this.bed_no = bed_no;
    }

    public Date getRecord_date() {
        return record_date;
    }

    public void setRecord_date(Date record_date) {
        this.record_date = record_date;
    }

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public Date getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(Date admission_date) {
        this.admission_date = admission_date;
    }

    public Date getDischarge_date() {
        return discharge_date;
    }

    public void setDischarge_date(Date discharge_date) {
        this.discharge_date = discharge_date;
    }

    public String getAdmitting_situation() {
        return admitting_situation;
    }

    public void setAdmitting_situation(String admitting_situation) {
        this.admitting_situation = admitting_situation;
    }

    public String getAdmitting_diagnosis() {
        return admitting_diagnosis;
    }

    public void setAdmitting_diagnosis(String admitting_diagnosis) {
        this.admitting_diagnosis = admitting_diagnosis;
    }

    public String getTreatment_process() {
        return treatment_process;
    }

    public void setTreatment_process(String treatment_process) {
        this.treatment_process = treatment_process;
    }

    public String getDischarge_diagnosis() {
        return discharge_diagnosis;
    }

    public void setDischarge_diagnosis(String discharge_diagnosis) {
        this.discharge_diagnosis = discharge_diagnosis;
    }

    public String getDischarge_situation() {
        return discharge_situation;
    }

    public void setDischarge_situation(String discharge_situation) {
        this.discharge_situation = discharge_situation;
    }

    public String getDischarge_advice() {
        return discharge_advice;
    }

    public void setDischarge_advice(String discharge_advice) {
        this.discharge_advice = discharge_advice;
    }

    public String getPhysician_signature() {
        return physician_signature;
    }

    public void setPhysician_signature(String physician_signature) {
        this.physician_signature = physician_signature;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
