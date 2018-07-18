package com.cxq.controller;

import com.cxq.domain.*;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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


    //跳转查询列表
    @RequestMapping("/to_case_search")
    public String SearchList(){

        return "case_search";
    }


    //审核跳转列表
    @RequestMapping("/to_case_audit")
    public String ChekList(){

        return "case_audit";
    }

    //查看审核详情
    @RequestMapping("/ShowSearch")
    public String ShowAudit(HttpServletRequest request, Model model){


        Map<String,Object> map = new HashedMap();

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
        model.addAttribute("listchec",listChec);
        model.addAttribute("listleav",listDisc.get(0));
        model.addAttribute("listvide",listVide);
        model.addAttribute("listultr",listUltr);

        //用户名
        String userName=request.getSession().getAttribute("username").toString();
        model.addAttribute("userName",userName);

        return "search_show";
    }

    //查看查询详情
    @RequestMapping("/ShowAudit")
    public String ShowSearch(HttpServletRequest request, Model model){


        Map<String,Object> map = new HashedMap();

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
        model.addAttribute("listchec",listChec);
        model.addAttribute("listleav",listDisc.get(0));
        model.addAttribute("listvide",listVide);
        model.addAttribute("listultr",listUltr);

        //用户名
        String userName=request.getSession().getAttribute("username").toString();
        model.addAttribute("userName",userName);

        return "Check_verify";
    }

    //审核后，点击提交
    @RequestMapping("/search_submit")
    public String search_submit(HttpServletRequest request){
        int status= Integer.parseInt(request.getParameter("Fruit"));

        if(status==1){
            //审核通过，状态变为1
        }else {
            status =2;
        }
        //审核未通过，状态为2

        String remarks=request.getParameter("remarks");
        String keyword=request.getParameter("keyword");
        medicalRecordRepository.setStatusAndRemarks(status,remarks,keyword);
        return "case_audit";
    }

}
