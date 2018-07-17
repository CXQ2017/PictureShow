package com.cxq.controller;

import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
        //1==病案首页,2==入院记录,3==病程记录,4==查房记录,5==出院记录,
        // 6==MR检查报告,7==CT检查报告,8==X检查报告,9==冠状动脉CTA成像,10==超声波影像,11==多普勒影像
//        List <PictureProperty> list1=picturePropertyRepository.findByKeyAcase(keyword,"1");
//        List <PictureProperty> list2=picturePropertyRepository.findByKeyAcase(keyword,"2");
//        List <PictureProperty> list3=picturePropertyRepository.findByKeyAcase(keyword,"3");
//        List <PictureProperty> list4=picturePropertyRepository.findByKeyAcase(keyword,"4");
//        List <PictureProperty> list5=picturePropertyRepository.findByKeyAcase(keyword,"5");
//        List <PictureProperty> list6=picturePropertyRepository.findByKeyAcase(keyword,"6");
//        List <PictureProperty> list7=picturePropertyRepository.findByKeyAcase(keyword,"7");
//        List <PictureProperty> list8=picturePropertyRepository.findByKeyAcase(keyword,"8");
//        List <PictureProperty> list9=picturePropertyRepository.findByKeyAcase(keyword,"9");
//        List <PictureProperty> list10=picturePropertyRepository.findByKeyAcase(keyword,"10");
//        List <PictureProperty> list11=picturePropertyRepository.findByKeyAcase(keyword,"11");
     // System.out.println(list1.get(0).getPicture_path());

        List <PictureProperty> list1=new ArrayList<>();
        List <PictureProperty> list2=new ArrayList<>();
        List <PictureProperty> list3=new ArrayList<>();
        List <PictureProperty> list4=new ArrayList<>();
        List <PictureProperty> list5=new ArrayList<>();
        List <PictureProperty> list6=new ArrayList<>();
        List <PictureProperty> list7=new ArrayList<>();
        List <PictureProperty> list8=new ArrayList<>();
        List <PictureProperty> list9=new ArrayList<>();
        List <PictureProperty> list10=new ArrayList<>();
        List <PictureProperty> list11=new ArrayList<>();

        List<PictureProperty> lists=picturePropertyRepository.findAllPdf(keyword);
        for (PictureProperty p:lists ) {
            if(p.getCase_module().equals("1")){
                list1.add(p);
            }
            if(p.getCase_module().equals("2")){
                list2.add(p);
            }
            if(p.getCase_module().equals("3")){
                list3.add(p);
            }
            if(p.getCase_module().equals("4")){
                list4.add(p);
            }
            if(p.getCase_module().equals("5")){
                list5.add(p);
            }
            if(p.getCase_module().equals("6")){
                list6.add(p);
            }
            if(p.getCase_module().equals("7")){
                list7.add(p);
            }
            if(p.getCase_module().equals("8")){
                list8.add(p);
            }
            if(p.getCase_module().equals("9")){
                list9.add(p);
            }
            if(p.getCase_module().equals("10")){
                list10.add(p);
            }
            if(p.getCase_module().equals("11")){
                list11.add(p);
            }
        }

        model.addAttribute("home_page",list1);
        model.addAttribute("enter_hospital",list2);
        model.addAttribute("disease_record",list3);
        model.addAttribute("check_record",list4);
        model.addAttribute("discharge_record",list5);
        model.addAttribute("mr_record",list6);
        model.addAttribute("ct_record",list7);
        model.addAttribute("x_record",list8);
        model.addAttribute("cta_record",list9);
        model.addAttribute("ul_record",list10);
        model.addAttribute("tr_record",list11);

         return "picture_details";
    }
}
