package com.cxq.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/12/012.
 * 经颅多普勒超声检查报告
 */
@Entity
@Table(name = "transcranial_doppler_report")
public class TranscranialDopplerReport {

    @Id
    @GeneratedValue
    private Integer id;
    private String department; //科室
    private String card_medical;  //病案号、住院号
    private String bed_no;    //床号
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date check_time;   //检查时间
    private String check_number;  //检查号
    @Column(columnDefinition="TEXT")
    private String TCD_content; //TCD描述
    @Column(columnDefinition="TEXT")
    private String TCD_conclusion;   //TCD结论
    private String physician_signature;  //医师签名

    //状态
    private Integer status;
    //创建日期
    private Date create_date;

    public TranscranialDopplerReport(){
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

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    public String getCheck_number() {
        return check_number;
    }

    public void setCheck_number(String check_number) {
        this.check_number = check_number;
    }

    public String getTCD_content() {
        return TCD_content;
    }

    public void setTCD_content(String TCD_content) {
        this.TCD_content = TCD_content;
    }

    public String getTCD_conclusion() {
        return TCD_conclusion;
    }

    public void setTCD_conclusion(String TCD_conclusion) {
        this.TCD_conclusion = TCD_conclusion;
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
