package com.cxq.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dministrator on 2018/4/12/012.
 * 各种影像检查报告：
 * 1--影像科MR检查报告书; 2--影像科CT检查报告书；3--影像科X检查报告
 */
@Entity
@Table(name = "video_report")
public class VideoReport {
    @Id
    @GeneratedValue
    private Integer vr_id; //主键ID
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date  report_time;   //报告日期
    private Integer patientId;  //病人id
    private String eclarationd_num; //申报单号
    private String card_medical;  //病案号、住院号
    private String department; //科室
    private String bed_no;    //床号
    private String inspection_area;    //检查部位
    private String video_content;    //影像学所见
    private String video_conclusion;   //影像学意见
    private String reported_doctor;   //报告医师
    private String check_doctor;   //审核医师
    private String final_check_doctor;  //终审医师
    private String video_status;  //影像类别：1--影像科MR检查报告书; 2--影像科CT检查报告书；3--影像科X检查报告

    private Integer status;
    private Date create_time;

    public VideoReport(){
        this.status=0;
        this.create_time=new Date();
    }

    public Integer getVr_id() {
        return vr_id;
    }

    public void setVr_id(Integer vr_id) {
        this.vr_id = vr_id;
    }

    public Date getReport_time() {
        return report_time;
    }

    public void setReport_time(Date report_time) {
        this.report_time = report_time;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getEclarationd_num() {
        return eclarationd_num;
    }

    public void setEclarationd_num(String eclarationd_num) {
        this.eclarationd_num = eclarationd_num;
    }

    public String getCard_medical() {
        return card_medical;
    }

    public void setCard_medical(String card_medical) {
        this.card_medical = card_medical;
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

    public String getInspection_area() {
        return inspection_area;
    }

    public void setInspection_area(String inspection_area) {
        this.inspection_area = inspection_area;
    }

    public String getVideo_content() {
        return video_content;
    }

    public void setVideo_content(String video_content) {
        this.video_content = video_content;
    }

    public String getVideo_conclusion() {
        return video_conclusion;
    }

    public void setVideo_conclusion(String video_conclusion) {
        this.video_conclusion = video_conclusion;
    }

    public String getReported_doctor() {
        return reported_doctor;
    }

    public void setReported_doctor(String reported_doctor) {
        this.reported_doctor = reported_doctor;
    }

    public String getCheck_doctor() {
        return check_doctor;
    }

    public void setCheck_doctor(String check_doctor) {
        this.check_doctor = check_doctor;
    }

    public String getFinal_check_doctor() {
        return final_check_doctor;
    }

    public void setFinal_check_doctor(String final_check_doctor) {
        this.final_check_doctor = final_check_doctor;
    }

    public String getVideo_status() {
        return video_status;
    }

    public void setVideo_status(String video_status) {
        this.video_status = video_status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
