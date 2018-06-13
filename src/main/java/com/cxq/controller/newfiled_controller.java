package com.cxq.controller;

import com.cxq.domain.*;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/12/012.
 */
@Controller
public class newfiled_controller {
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Autowired
    private HospitalizedRepository hospitalizedRepository;

    @Autowired
    private DiseaseRecordRepository diseaseRecordRepository;

    @Autowired
    private CheckRecordRepository checkRecordRepository;

    @Autowired
    private DischargeRecordRepository dischargeRecordRepository;

    @Autowired
    private VideoReportRepository videoReportRepository;

    @Autowired
    private UltrasonicDiagnosisReportRepository ultrasonicDiagnosisReportRepository;

    @Autowired
    private TranscranialDopplerReportRepository transcranialDopplerReportRepository;

    @Autowired
    private HeartRateChartRepository heartRateChartRepository;

    //跳转到病例信息录入
    @RequestMapping("/toChoosecaseKinds")
    public String tochooseCaseInformationKinds(){
        // <h2 th:text="${diseaseRecord.Card_medical}"></h2>
//          DiseaseRecord diseaseRecord= diseaseRecordRepository.find_one("274318");
//        System.out.println("病程记录274318的记录："+diseaseRecord.getCard_medical());
//        model.addAttribute("diseaseRecord",diseaseRecord);

        // diseaseRecord=diseaseRecordRepository.save();
        // return "chooseCaseInformationKinds";

//        List<MedicalRecord> list=medicalRecordRepository.find_allmsg();
        //  List<String> status=new ArrayList<>();
//        for (MedicalRecord data:list) {
//            if(data.getStatu()==0){
//          //     status.add("待审核");
//
//            }else if(data.getStatu()==1){
//           //     status.add("审核通过");
//            }else if(data.getStatu()==2){
//           //     status.add("审核未通过");
//            }
//        }
        //  JSONArray jsonArray=new JSONArray();

//        model.addAttribute("sta", StatusUtile.mapStatus);
//        model.addAttribute("list",list);
//        model.addAttribute("status",status);
        //  jsonArray.add(list);
        //  jsonArray.add(status);
        //     model.addAttribute("jsonArray",jsonArray);
        return "newCreatedCase";
    }

    //新建病例档案
    @RequestMapping("/newfiled")
    @ResponseBody
    public List<MedicalRecord> newfile_method(HttpServletRequest request){
        String card_medical=request.getParameter("card_medical");
        String name=request.getParameter("name");
        Integer times_hospitalized=Integer.parseInt(request.getParameter("times_hospitalized"));
        String keyword=card_medical+"_"+times_hospitalized;
        //System.out.println(keyword);
        //将新建数据插入各表
        MedicalRecord medicalRecord=new MedicalRecord();
        Hospitalized hospitalized=new Hospitalized();
        DiseaseRecord diseaseRecord=new DiseaseRecord();
        DischargeRecord dischargeRecord=new DischargeRecord();
        CheckRecord checkRecord=new CheckRecord();
        HeartRateChart heartRateChart=new HeartRateChart();
        TranscranialDopplerReport transcranialDopplerReport=new TranscranialDopplerReport();
        UltrasonicDiagnosisReport ultrasonicDiagnosisReport=new UltrasonicDiagnosisReport();
        VideoReport videoReport=new VideoReport();


        medicalRecord.setCard_medical(card_medical);
        medicalRecord.setName(name);
        medicalRecord.setTimes_hospitalized(times_hospitalized);
        medicalRecord.setKeyword(keyword);
        medicalRecord.setStatus(0);
        medicalRecord.setCreate_time(new Date());
        medicalRecordRepository.save(medicalRecord);

        hospitalized.setKeyword(keyword);
        hospitalized.setStatus(0);
        hospitalized.setCreate_time(new Date());
        hospitalizedRepository.save(hospitalized);

        diseaseRecord.setKeyword(keyword);
        dischargeRecord.setStatus(0);
        diseaseRecord.setCreate_date(new Date());
        diseaseRecordRepository.save(diseaseRecord);

        dischargeRecord.setKeyword(keyword);
        dischargeRecord.setStatus(0);
        dischargeRecord.setCreate_date(new Date());
        dischargeRecordRepository.save(dischargeRecord);

        checkRecord.setKeyword(keyword);
        checkRecord.setStatus(0);
        checkRecord.setCreate_date(new Date());
        checkRecordRepository.save(checkRecord);

        heartRateChart.setKeyword(keyword);
        heartRateChart.setStatus(0);
        heartRateChart.setCreate_date(new Date());
        heartRateChartRepository.save(heartRateChart);

        transcranialDopplerReport.setKeyword(keyword);
        transcranialDopplerReport.setStatus(0);
        transcranialDopplerReport.setCreate_date(new Date());
        transcranialDopplerReportRepository.save(transcranialDopplerReport);

        ultrasonicDiagnosisReport.setKeyword(keyword);
        ultrasonicDiagnosisReport.setStatus(0);
        ultrasonicDiagnosisReport.setCreate_date(new Date());
        ultrasonicDiagnosisReportRepository.save(ultrasonicDiagnosisReport);

        videoReport.setKeyword(keyword);
        videoReport.setStatus(0);
        videoReport.setCreate_time(new Date());
        videoReportRepository.save(videoReport);

        List<MedicalRecord> list= medicalRecordRepository.find_allmsg();
        return list;
    }

    @ResponseBody
    @RequestMapping("/nopass")
    public Map<String,Object> nopass(){
        List<MedicalRecord> list=new ArrayList<>();
        //status=2,表示审核不通过
        list=medicalRecordRepository.find_one();
        Map<String,Object> map2=new HashedMap();
        map2.put("data",list);
        return map2;
    }

    //点击编辑
    @RequestMapping("/edit/{keyword}")
    public String edit(@PathVariable("keyword")String keyword){
        System.out.println(keyword);
        return "index";
    }


}
