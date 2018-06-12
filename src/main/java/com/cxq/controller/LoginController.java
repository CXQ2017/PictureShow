package com.cxq.controller;

import com.cxq.domain.User;
import com.cxq.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/12.
 */

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value= "/login_in" )
    public String login(HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();

        String username = request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("#"+username+"#"+password);

        List<User> list = userRepository.finduser(username,password);

        if(list.isEmpty()){
            return "index";
        }
        return "tagged_pdf";

    }
}
