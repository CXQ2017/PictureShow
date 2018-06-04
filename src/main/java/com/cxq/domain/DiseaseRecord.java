package com.cxq.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/11/011.
 *
 * 病程记录单
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
    @Column(columnDefinition="TEXT")
    private String first_disease_record; //首次病程记录内容
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date first_disease_record_time;    //首次病程记录时间
    //病例特点
    @Column(columnDefinition="TEXT")
    private String case_trait;
    @Column(columnDefinition="TEXT")
    private String history_characteristics;   //病史特点
    @Column(columnDefinition="TEXT")
    private String past_medical_history;     //既往史
    @Column(columnDefinition="TEXT")
    private String hospital_medical;   //入园体检
    @Column(columnDefinition="TEXT")
    private String auxiliary_examination;  //辅助检查

    //诊断、诊断依据及鉴别诊断
    //private String diagnostic_procedure;
    @Column(columnDefinition="TEXT")
    private String primary_diagnosis;   //初步诊断
    @Column(columnDefinition="TEXT")
    private String diagnostic_basis;    //诊断依据
    @Column(columnDefinition="TEXT")
    private String identify_diagnostic;    //鉴别诊断
    @Column(columnDefinition="TEXT")
    private String  support_point;   //支持点
    @Column(columnDefinition="TEXT")
    private String not_supported;    //不支持点
    @Column(columnDefinition="TEXT")
    private String conclusion;   //结论
    //诊疗计划
    @Column(columnDefinition="TEXT")
    private String diagnostic_plan;
    //状态
    private Integer status;
    //创建时间
    private Date create_date;

    //唯一标识
    private String keyword;


    public DiseaseRecord(){
        this.status=0;
        this.create_date=new Date();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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

    public String getFirst_disease_record() {
        return first_disease_record;
    }

    public void setFirst_disease_record(String first_disease_record) {
        this.first_disease_record = first_disease_record;
    }

    public Date getFirst_disease_record_time() {
        return first_disease_record_time;
    }

    public void setFirst_disease_record_time(Date first_disease_record_time) {
        this.first_disease_record_time = first_disease_record_time;
    }

    public String getCase_trait() {
        return case_trait;
    }

    public void setCase_trait(String case_trait) {
        this.case_trait = case_trait;
    }

    public String getHistory_characteristics() {
        return history_characteristics;
    }

    public void setHistory_characteristics(String history_characteristics) {
        this.history_characteristics = history_characteristics;
    }

    public String getPast_medical_history() {
        return past_medical_history;
    }

    public void setPast_medical_history(String past_medical_history) {
        this.past_medical_history = past_medical_history;
    }

    public String getHospital_medical() {
        return hospital_medical;
    }

    public void setHospital_medical(String hospital_medical) {
        this.hospital_medical = hospital_medical;
    }

    public String getAuxiliary_examination() {
        return auxiliary_examination;
    }

    public void setAuxiliary_examination(String auxiliary_examination) {
        this.auxiliary_examination = auxiliary_examination;
    }

    public String getPrimary_diagnosis() {
        return primary_diagnosis;
    }

    public void setPrimary_diagnosis(String primary_diagnosis) {
        this.primary_diagnosis = primary_diagnosis;
    }

    public String getDiagnostic_basis() {
        return diagnostic_basis;
    }

    public void setDiagnostic_basis(String diagnostic_basis) {
        this.diagnostic_basis = diagnostic_basis;
    }

    public String getIdentify_diagnostic() {
        return identify_diagnostic;
    }

    public void setIdentify_diagnostic(String identify_diagnostic) {
        this.identify_diagnostic = identify_diagnostic;
    }

    public String getSupport_point() {
        return support_point;
    }

    public void setSupport_point(String support_point) {
        this.support_point = support_point;
    }

    public String getNot_supported() {
        return not_supported;
    }

    public void setNot_supported(String not_supported) {
        this.not_supported = not_supported;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getDiagnostic_plan() {
        return diagnostic_plan;
    }

    public void setDiagnostic_plan(String diagnostic_plan) {
        this.diagnostic_plan = diagnostic_plan;
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
