package com.cxq.controller;

import com.cxq.domain.User;
import com.cxq.domain.UserRepository;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/6/12.
 */

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping(value= "/login_in")
    public JSONObject login(HttpServletRequest request, Model model){

//        Map<String, Object> map = new HashMap<>();

        JSONObject jsonObject = new JSONObject();
        String username = request.getParameter("username");
        String password=request.getParameter("password");

        System.out.println("#"+username+"#"+password);

        List<User> list = userRepository.finduser(username,password);


        if(list.isEmpty()){
            jsonObject.put("data","用户名密码错误");
        } else  {
            model.addAttribute("listuser",list.get(0));
            Integer status = Integer.valueOf(list.get(0).getStatus()) ;
            String  sqlname = list.get(0).getUser_name();
            String  sqlpassword = list.get(0).getPassword();
            Long userid=list.get(0).getId();

            request.getSession().setAttribute("status",status);

            request.getSession().setAttribute("userId",userid);
            request.getSession().setAttribute("username",sqlname);
            request.getSession().setAttribute("password",sqlpassword);
            System.out.println("#"+sqlname+"#"+sqlpassword+"#"+status);
            if (status==0){

               jsonObject.put("data","管理员登录成功");
            }else {
                jsonObject.put("data","用户登录成功");
            }

            }
            return jsonObject;
    }
}
