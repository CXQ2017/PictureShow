package com.cxq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/12/012.
 * 超声波检查报告
 */
@Entity
@Table(name ="ultrasonic_diagnosis_report")
public class UltrasonicDiagnosisReport {
    @Id
    @GeneratedValue
   private Integer id;
   private String ultrasonic_number;  //超声波号
   private String department; //科室
    private String card_medical;  //病案号、住院号
    private String bed_no;    //床号
    private String check_equipment;  //检查设备
    private String inspection_area;  //检查部位
    private String ultrasonic_content;  //超声所见
    private String ultrasonic_tip;  //超声提示
    private String diagnosis_doctor; //诊断医师
    private String  consultant_doctor;  //会诊医师
    private String report_date;  //报告日期
   private String print_date;  //打印日期

    //状态
    private Integer status;
    //创建日期
    private Date create_date;


    public UltrasonicDiagnosisReport(String ultrasonic_number, String department, String card_medical, String bed_no,
                                     String check_equipment, String inspection_area, String ultrasonic_content,
                                     String ultrasonic_tip, String diagnosis_doctor,
                                     String consultant_doctor, String report_date, String print_date, Integer status, Date create_date) {
        this.ultrasonic_number = ultrasonic_number;
        this.department = department;
        this.card_medical = card_medical;
        this.bed_no = bed_no;
        this.check_equipment = check_equipment;
        this.inspection_area = inspection_area;
        this.ultrasonic_content = ultrasonic_content;
        this.ultrasonic_tip = ultrasonic_tip;
        this.diagnosis_doctor = diagnosis_doctor;
        this.consultant_doctor = consultant_doctor;
        this.report_date = report_date;
        this.print_date = print_date;
        this.status = status;
        this.create_date = create_date;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUltrasonic_number() {
        return ultrasonic_number;
    }

    public void setUltrasonic_number(String ultrasonic_number) {
        this.ultrasonic_number = ultrasonic_number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
    }

    public String getBed_no() {
        return bed_no;
    }

    public void setBed_no(String bed_no) {
        this.bed_no = bed_no;
    }

    public String getCheck_equipment() {
        return check_equipment;
    }

    public void setCheck_equipment(String check_equipment) {
        this.check_equipment = check_equipment;
    }

    public String getInspection_area() {
        return inspection_area;
    }

    public void setInspection_area(String inspection_area) {
        this.inspection_area = inspection_area;
    }

    public String getUltrasonic_content() {
        return ultrasonic_content;
    }

    public void setUltrasonic_content(String ultrasonic_content) {
        this.ultrasonic_content = ultrasonic_content;
    }

    public String getUltrasonic_tip() {
        return ultrasonic_tip;
    }

    public void setUltrasonic_tip(String ultrasonic_tip) {
        this.ultrasonic_tip = ultrasonic_tip;
    }

    public String getDiagnosis_doctor() {
        return diagnosis_doctor;
    }

    public void setDiagnosis_doctor(String diagnosis_doctor) {
        this.diagnosis_doctor = diagnosis_doctor;
    }

    public String getConsultant_doctor() {
        return consultant_doctor;
    }

    public void setConsultant_doctor(String consultant_doctor) {
        this.consultant_doctor = consultant_doctor;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public String getPrint_date() {
        return print_date;
    }

    public void setPrint_date(String print_date) {
        this.print_date = print_date;
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
