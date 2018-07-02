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
        request.getSession().setAttribute("username",username);
        request.getSession().setAttribute("password",password);
        System.out.println("#"+list.get(0).getStatus());
       Integer status = Integer.valueOf(list.get(0).getStatus()) ;
        if(list.isEmpty()){
            return "index";
        } else if (status==0) {

                return "Access_management";
            }

        return "tagged_pdf";

    }
}
