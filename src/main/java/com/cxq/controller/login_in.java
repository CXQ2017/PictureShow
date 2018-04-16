package com.cxq.controller;

import com.cxq.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/4/11.
 */
@Controller
public class login_in {
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


    //跳转到登录
    @RequestMapping("/tologin")
    public String toLogin(){
        return "home";
    }



    //跳转到病例信息录入
    @RequestMapping("/toChoosecaseKinds")
    public String tochooseCaseInformationKinds(){
        return "chooseCaseInformationKinds";
    }

     //跳转到住院首页medicalRecord
     @RequestMapping("/toChoosecaseKinds/tomedicalRecord")
     public String tomedicalRecord(){
         return "medicalRecord";
     }


    //住院首页添加信息
    @PostMapping("/medical_record")
        public String addMedicalRecord(@ModelAttribute MedicalRecord medicalRecord) {
        System.out.println("打印住院首页的住院号："+medicalRecord.getCard_medical());
      medicalRecordRepository.save(medicalRecord);
        return "chooseCaseInformationKinds";
    }


      //跳转到入院记录
    @RequestMapping("/toChoosecaseKinds/toHospitalized")
    public String toHospitalized(){
        return "hospitalized";
    }

    //入院记录添加信息
    @PostMapping("/addHospitalized")
    public String  addHospitalized(@ModelAttribute Hospitalized hospitalized) {
        System.out.println("打印入院记录的ID："+hospitalized.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        hospitalizedRepository.save(hospitalized);
        return "chooseCaseInformationKinds";
    }

   // 跳转到病程记录
   @RequestMapping("/toChoosecaseKinds/tocourse_disease")
   public String tocourse_disease(){
       return "course_disease";
   }

    //病程记录
    @PostMapping("/addcourse_disease")
    public String  addDiseaseRecord(@ModelAttribute DiseaseRecord diseaseRecord) {
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        diseaseRecordRepository.save(diseaseRecord);
        return "chooseCaseInformationKinds";
    }



    //医师护理记录
    @PostMapping("/i1w11")
    public String  addCheckRecord(@ModelAttribute CheckRecord checkRecord) {
        System.out.println("打印医师护理记录的ID："+checkRecord.getBc_id());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        checkRecordRepository.save(checkRecord);
        return "index";
    }

    //出院记录
    @PostMapping("/i1w221")
    public String  addDischargeRecord(@ModelAttribute DischargeRecord dischargeRecord) {
        System.out.println("打印出院记录的ID："+dischargeRecord.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        dischargeRecordRepository.save(dischargeRecord);
        return "index";
    }

    //影像报告
    @PostMapping("/i1www")
    public String  addVideoReport(@ModelAttribute VideoReport videoReport) {
        System.out.println("打印影像报告的ID："+videoReport.getVr_id());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        videoReportRepository.save(videoReport);
        return "index";
    }

    //超声波报告
    @PostMapping("/i1w22")
    public String  addUltrasonicDiagnosisReport(@ModelAttribute UltrasonicDiagnosisReport ultrasonicDiagnosisReport) {
        System.out.println("打印超声波报告的ID："+ultrasonicDiagnosisReport.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        ultrasonicDiagnosisReportRepository.save(ultrasonicDiagnosisReport);
        return "index";
    }

    //经颅多普勒超声检查报告
    @PostMapping("/i1waa")
    public String  addTranscranialDopplerReport(@ModelAttribute TranscranialDopplerReport transcranialDopplerReport) {
        System.out.println("打印经颅多普勒超声检查报告的ID："+transcranialDopplerReport.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        transcranialDopplerReportRepository.save(transcranialDopplerReport);
        return "index";
    }
    //经颅多普勒超声检查报告
    @PostMapping("/i1wss")
    public String  addHeartRateChart(@ModelAttribute HeartRateChart heartRateChart) {
        System.out.println("打印经颅多普勒超声检查报告的ID："+heartRateChart.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        heartRateChartRepository.save(heartRateChart);
        return "index";
    }
}
