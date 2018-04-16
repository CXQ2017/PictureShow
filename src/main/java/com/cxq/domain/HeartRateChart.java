package com.cxq.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dministrator on 2018/4/12/012.
 * 心率图
 */
@Entity
@Table(name = "heart_rate_chart")
public class HeartRateChart {
    @Id
    @GeneratedValue
    private Integer id;
    private String department; //科室
    private String card_medical;  //病案号、住院号
    private String bed_no;    //床号
    private String ventricular_rate; //心室率
    private String sinus_rhythm;  //窦性心律
    private String PR_interphase;    //PR间期
    private String QRS_width;    //QRS宽度
    private String QT;  //QT
    private String P_R_T; //P_R_T轴

    //状态
    private Integer status;
    //创建日期
    private Date create_date;


    public HeartRateChart(){
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

    public String getVentricular_rate() {
        return ventricular_rate;
    }

    public void setVentricular_rate(String ventricular_rate) {
        this.ventricular_rate = ventricular_rate;
    }

    public String getSinus_rhythm() {
        return sinus_rhythm;
    }

    public void setSinus_rhythm(String sinus_rhythm) {
        this.sinus_rhythm = sinus_rhythm;
    }

    public String getPR_interphase() {
        return PR_interphase;
    }

    public void setPR_interphase(String PR_interphase) {
        this.PR_interphase = PR_interphase;
    }

    public String getQRS_width() {
        return QRS_width;
    }

    public void setQRS_width(String QRS_width) {
        this.QRS_width = QRS_width;
    }

    public String getQT() {
        return QT;
    }

    public void setQT(String QT) {
        this.QT = QT;
    }

    public String getP_R_T() {
        return P_R_T;
    }

    public void setP_R_T(String p_R_T) {
        P_R_T = p_R_T;
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
