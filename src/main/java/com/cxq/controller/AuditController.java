package com.cxq.controller;

import com.cxq.domain.Hospitalized;
import com.cxq.domain.HospitalizedRepository;
import com.cxq.domain.MedicalRecord;
import com.cxq.domain.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/6/12.
 */

@Controller
public class AuditController {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Autowired
    private HospitalizedRepository hospitalizedRepository;

    @RequestMapping("/to_case_search")
    public String AuditList(){

        return "case_search";
    }

    @RequestMapping("/ShowAudit")
    public String ShowAudit(HttpServletRequest request, Model model){

       String keyword = request.getParameter("id");
        System.out.println("keyword = "+keyword);
        List<MedicalRecord> listMedi = medicalRecordRepository.findByKeyword(keyword);
        List<Hospitalized> listHosp = hospitalizedRepository.findByKeyword(keyword);
//        Map<String,Object> map = new HashedMap();
        if(listMedi.isEmpty()){
            System.out.println("keyword = "+keyword+"查找为空");
            return "case_search";
        }
        model.addAttribute("listmedi",listMedi.get(0));
//        model.addAttribute("listHosp",listHosp.get(0));

        return "search_show";
    }
}
