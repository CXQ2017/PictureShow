package com.cxq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/4/11/011.
 */
@Entity
@Table(name="disease_record")
public class DiseaseRecord {

    @Id
    @GeneratedValue
    private Integer bc_id;

    //科室
    private String  department;
    //床号
    private String bed_no;
    //病案号
    private String card_medical;
    //病例特点
    private String case_trait;
    //诊断、诊断依据及鉴别诊断
    private String diagnostic_procedure;
    //诊疗计划
    private String diagnostic_plan;
    //状态
    private String status;
    //创建时间
    private String create_date;

    public DiseaseRecord(String department, String bed_no, String card_medical, String case_trait, String diagnostic_procedure, String diagnostic_plan, String status, String create_date) {
        this.department = department;
        this.bed_no = bed_no;
        this.card_medical = card_medical;
        this.case_trait = case_trait;
        this.diagnostic_procedure = diagnostic_procedure;
        this.diagnostic_plan = diagnostic_plan;
        this.status = status;
        this.create_date = create_date;
    }

    public Integer getBc_id() {
        return bc_id;
    }

    public void setBc_id(Integer bc_id) {
        this.bc_id = bc_id;
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

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public String getCase_trait() {
        return case_trait;
    }

    public void setCase_trait(String case_trait) {
        this.case_trait = case_trait;
    }

    public String getDiagnostic_procedure() {
        return diagnostic_procedure;
    }

    public void setDiagnostic_procedure(String diagnostic_procedure) {
        this.diagnostic_procedure = diagnostic_procedure;
    }

    public String getDiagnostic_plan() {
        return diagnostic_plan;
    }

    public void setDiagnostic_plan(String diagnostic_plan) {
        this.diagnostic_plan = diagnostic_plan;
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
