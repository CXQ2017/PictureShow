package com.cxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/4/11.
 */
@Controller
public class login_in {

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String login(Model model){
//				String username = request.getParameter("username");
//		String password = request.getParameter("password");
        model.addAttribute("age","name");
        return "tagged_pdf";
    }



}
