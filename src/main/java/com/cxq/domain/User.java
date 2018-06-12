package com.cxq.domain;

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
    private Integer id ;

    private Date  creat_data;

    private String status;

    private String user_name;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreat_data() {
        return creat_data;
    }

    public void setCreat_data(Date creat_data) {
        this.creat_data = creat_data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
