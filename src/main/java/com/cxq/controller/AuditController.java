package com.cxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/6/12.
 */

@Controller
public class AuditController {

    @RequestMapping("/to_case_search")
    public String AuditList(){

        return "case_search";
    }

    @RequestMapping("/ShowAudit")
    public String ShowAudit(HttpServletRequest request){

       String s = request.getParameter("id");
        System.out.println(s);
        return "check_verify";
    }
}
