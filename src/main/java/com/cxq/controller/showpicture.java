package com.cxq.controller;

import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/7/6/006.
 */
@Controller
public class showpicture {
    @Autowired
    private PicturePropertyRepository picturePropertyRepository;

    @RequestMapping("/pdf_show")
    public String pdf_show (HttpServletRequest request, Model model){
        String keyword=request.getParameter("keyword");
        List <PictureProperty> list1=picturePropertyRepository.findByKeyAcase(keyword,"1");
      System.out.println(list1.get(0).getPicture_path());
        model.addAttribute("home_page",list1.get(0));
        return "picture_details";
    }
}
