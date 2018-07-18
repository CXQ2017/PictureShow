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

     /*
        1、病案首页 == home_page
        2、	入院记录 ==enter_hospital
        3、	病程记录  ==disease_record
        4、	查房记录  check_record
        5、	出院记录   discharge_record
        6、	手术系列   operation_record
        7、	疑难危重病例讨论记录  Troubled_case
        8、	死亡记录  Death_record
        9、	死亡病例讨论记录  Death_discussion
        10、	其他治疗记录表单（介入治疗，糖尿病，碎石）  Other_treatment_record
        11、	输血治疗知情同意书  Blood_transfusion_treatment
        12、	特殊检查、特殊治疗知情同意书  Special_check
        13、	会诊清单   consultations_list
        14、	病危通知书   criticalill_Notification
        15、	入院通知书  Notice_of_Admission
        16、	病理资料  Pathological_data
        17、	辅助检查报告单（生化、三大常规） Auxiliary_inspection
        18、	内窥镜检查报告单   Endoscopic_examination
        19、	医学影像检查报告单（CTA，MR，CT，X,B）video_record
        20、	其他检查（脑电图、肌电图、心电图等）  other_check
        21、	体温单    Thermometer
        22、	医嘱单     Medical_orders
        23、	护理记录    Nursing_records
        24、	其他（麻醉收费、植入材料、社保资料、住院告知） others
*/

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
        List <PictureProperty> list12=new ArrayList<>();
        List <PictureProperty> list13=new ArrayList<>();
        List <PictureProperty> list14=new ArrayList<>();
        List <PictureProperty> list15=new ArrayList<>();
        List <PictureProperty> list16=new ArrayList<>();
        List <PictureProperty> list17=new ArrayList<>();
        List <PictureProperty> list18=new ArrayList<>();
        List <PictureProperty> list19=new ArrayList<>();
        List <PictureProperty> list20=new ArrayList<>();
        List <PictureProperty> list21=new ArrayList<>();
        List <PictureProperty> list22=new ArrayList<>();
        List <PictureProperty> list23=new ArrayList<>();
        List <PictureProperty> list24=new ArrayList<>();

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
            if(p.getCase_module().equals("12")){
                list12.add(p);
            }
            if(p.getCase_module().equals("13")){
                list13.add(p);
            }
            if(p.getCase_module().equals("14")){
                list14.add(p);
            }
            if(p.getCase_module().equals("15")){
                list15.add(p);
            }
            if(p.getCase_module().equals("16")){
                list16.add(p);
            }
            if(p.getCase_module().equals("17")){
                list17.add(p);
            }
            if(p.getCase_module().equals("18")){
                list18.add(p);
            }
            if(p.getCase_module().equals("19")){
                list19.add(p);
            }
            if(p.getCase_module().equals("20")){
                list20.add(p);
            }
            if(p.getCase_module().equals("21")){
                list21.add(p);
            }
            if(p.getCase_module().equals("22")){
                list22.add(p);
            }
            if(p.getCase_module().equals("23")){
                list23.add(p);
            }
            if(p.getCase_module().equals("24")){
                list24.add(p);
            }
        }

        model.addAttribute("home_page",list1);
        model.addAttribute("enter_hospital",list2);
        model.addAttribute("disease_record",list3);
        model.addAttribute("check_record",list4);
        model.addAttribute("discharge_record",list5);
        model.addAttribute("operation_record",list6);
        model.addAttribute("Troubled_case",list7);
        model.addAttribute("Death_record",list8);
        model.addAttribute("Death_discussion",list9);
        model.addAttribute("Other_treatment_record",list10);
        model.addAttribute("Blood_transfusion_treatment",list11);
        model.addAttribute("Special_check",list12);
        model.addAttribute("consultations_list",list13);
        model.addAttribute("criticalill_Notification",list14);
        model.addAttribute("Notice_of_Admission" ,list15);
        model.addAttribute("Pathological_data",list16);
        model.addAttribute("Auxiliary_inspection",list17);
        model.addAttribute("Endoscopic_examination",list18);
        model.addAttribute("video_record",list19);
        model.addAttribute("other_check",list20);
        model.addAttribute("Thermometer",list21);
        model.addAttribute("Medical_orders",list22);

        model.addAttribute("Nursing_records",list23);
        model.addAttribute("others",list24);
         return "picture_details";
    }
}
