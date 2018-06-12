package com.cxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/12.
 */

@Controller
public class LoginController {

    @RequestMapping(value= "/login_in" )
    public String login(HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();

        String username = request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("#"+username+"#"+password);
        if(username.equals("000000")&&password.equals("000000")){
            //登陆成功
            return "tagged_pdf";
        }

        return "index";
    }
}
