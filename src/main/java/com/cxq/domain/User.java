package com.cxq.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/12.
 */

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id ;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date  creat_data;

    private int  status;//0--管理员，1---审核人员，2---录入员，3---普通用户

    private String user_name;

    private String password;



    public User(){
        this.creat_data=new Date();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreat_data() {
        return creat_data;
    }

    public void setCreat_data(Date creat_data) {
        this.creat_data = creat_data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
