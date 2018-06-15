package com.cxq.controller;

import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import com.cxq.domain.User;
import com.cxq.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/14.
 */

@Controller
public class PictureController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PicturePropertyRepository picturePropertyRepository;


    @RequestMapping("/pictrue_list")
    public String PictrueList(HttpServletRequest request, Model model){

        String username = request.getSession().getAttribute("username").toString();
        String password = request.getSession().getAttribute("password").toString();
        System.out.println("username = "+username);
        List<User> listuser = userRepository.finduser(username,password);
        model.addAttribute("listuser",listuser.get(0));

        return "picture_list";
    }

    @RequestMapping("/pdf_list")
    public Map<String, Object> PDFList(){

        HashMap<String,Object> map = new HashMap<>();
        List<PictureProperty> list = picturePropertyRepository.findAll();
        map.put("data",list);
        return map;
    }

}
