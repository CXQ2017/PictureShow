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
        System.out.println("打印住院首页的住院号："+medicalRecord.getCard_medical()+"..."+medicalRecord.getBirthday());

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
        System.out.println("打印入院记录的ID："+hospitalized.getCard_medical());
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
        System.out.println("病程记录:既往史"+diseaseRecord.getHistory_characteristics());
        diseaseRecordRepository.save(diseaseRecord);
        return "chooseCaseInformationKinds";
    }


    // 跳转到医师护理
    @RequestMapping("/toChoosecaseKinds/toCheck_record")
    public String toCheck_record(){
        return "Check_record";
    }
    //医师护理记录
    @PostMapping("/addCheck_record")
    public String  addCheckRecord(@ModelAttribute CheckRecord checkRecord) {
       // System.out.println("打印医师护理记录的ID："+checkRecord.getBc_id());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        checkRecordRepository.save(checkRecord);
        return "chooseCaseInformationKinds";
    }

    // 跳转到出院记录
    @RequestMapping("/toChoosecaseKinds/toleave_hospital")
    public String toleave_hospital(){
        return "leave_hospital";
    }

    //出院记录
    @PostMapping("/addleave_hospital")
    public String  addDischargeRecord(@ModelAttribute DischargeRecord dischargeRecord) {
       // System.out.println("打印出院记录的ID："+dischargeRecord.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        dischargeRecordRepository.save(dischargeRecord);
        return "chooseCaseInformationKinds";
    }

    // 跳转到影像科记录
    @RequestMapping("/toChoosecaseKinds/tovideo_report")
    public String tovideo_report(){
        return "video_report";
    }

    //影像报告
    @PostMapping("/addvideo_report")
    public String  addVideoReport(@ModelAttribute VideoReport videoReport) {
       // System.out.println("打印影像报告的ID："+videoReport.getVr_id());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        videoReportRepository.save(videoReport);
        return "chooseCaseInformationKinds";
    }

    // 跳转到超声波
    @RequestMapping("/toChoosecaseKinds/toultrasonic_diagnosisReport")
    public String toultrasonic_diagnosisReport(){
        return "ultrasonic_diagnosisReport";
    }


    //超声波报告
    @PostMapping("/addultrasonic_diagnosisReport")
    public String  addultrasonic_diagnosisReport(@ModelAttribute UltrasonicDiagnosisReport ultrasonicDiagnosisReport) {
       // System.out.println("打印超声波报告的ID："+ultrasonicDiagnosisReport.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        ultrasonicDiagnosisReportRepository.save(ultrasonicDiagnosisReport);
        return "chooseCaseInformationKinds";
    }


    // 跳转到经颅多普勒超声检查
    @RequestMapping("/toChoosecaseKinds/toTranscranial_doppler_report")
    public String toTranscranial_doppler_report(){
        return "transcraniai_doppler";
    }

    //经颅多普勒超声检查报告
    @PostMapping("/addTranscranial_doppler_report")
    public String  addTranscranialDopplerReport(@ModelAttribute TranscranialDopplerReport transcranialDopplerReport) {
      //  System.out.println("打印经颅多普勒超声检查报告的ID："+transcranialDopplerReport.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        transcranialDopplerReportRepository.save(transcranialDopplerReport);
        return "chooseCaseInformationKinds";
    }


    // 跳转到心率图
    @RequestMapping("/toChoosecaseKinds/toheart_rateChart")
    public String toheart_rateChart(){
        return "heart_rateChart";
    }

    //心率图检查报告
    @PostMapping("/addheart_rateChart")
    public String  addHeartRateChart(@ModelAttribute HeartRateChart heartRateChart) {
      //  System.out.println("打印经颅多普勒超声检查报告的ID："+heartRateChart.getId());
        //4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
        heartRateChartRepository.save(heartRateChart);
        return "chooseCaseInformationKinds";
    }
}
