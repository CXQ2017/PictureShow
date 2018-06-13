package com.cxq.controller;

import com.cxq.domain.*;
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

    //病案首页
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;
    //入院记录
    @Autowired
    private HospitalizedRepository hospitalizedRepository;
    //病程记录
    @Autowired
    private DiseaseRecordRepository diseaseRecordRepository;
    //查房记录
    @Autowired
    private CheckRecordRepository checkRecordRepository;
    //出院记录
    @Autowired
    private DischargeRecordRepository dischargeRecordRepository;
    //X/CT/RM
    @Autowired
    private VideoReportRepository videoReportRepository;
    //超声波
    @Autowired
    private UltrasonicDiagnosisReportRepository ultrasonicDiagnosisReportRepository;
    //多普勒
    @Autowired
    private TranscranialDopplerReportRepository transcranialDopplerReportRepository;


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
        List<DiseaseRecord> listDise = diseaseRecordRepository.findByKeyword(keyword);
        List<CheckRecord> listChec = checkRecordRepository.findByKeyword(keyword);
        List<DischargeRecord> listDisc = dischargeRecordRepository.findByKeyword(keyword);
        List<VideoReport> listVide = videoReportRepository.findByKeyword(keyword);
        List<UltrasonicDiagnosisReport> listUltr = ultrasonicDiagnosisReportRepository.findByKeyword(keyword);
        List<TranscranialDopplerReport> listTran = transcranialDopplerReportRepository.findByKeyword(keyword);


        if(listMedi.isEmpty()){
            System.out.println("keyword = "+keyword+"查找为空");
            return "case_search";
        }
        if(listTran.isEmpty()){
            System.out.println("listTran= "+keyword+"查找为空");
            model.addAttribute("listtran",null);
//            return "case_search";
        }else {
            model.addAttribute("listtran",listTran.get(0));
        }
        model.addAttribute("listmedi",listMedi.get(0));
        model.addAttribute("listhosp",listHosp.get(0));
        model.addAttribute("listcour",listDise.get(0));
        model.addAttribute("listleav",listChec);
        model.addAttribute("listleav",listDisc.get(0));
        model.addAttribute("video",listVide);
        model.addAttribute("listultr",listUltr);


        return "search_show";
    }
}
