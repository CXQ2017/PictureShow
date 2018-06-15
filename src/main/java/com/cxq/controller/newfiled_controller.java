package com.cxq.controller;

import com.cxq.domain.*;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.LinkedList;
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
        hospitalized.setCard_medical(card_medical);
        hospitalized.setStatus(0);
        hospitalized.setCreate_time(new Date());
        hospitalizedRepository.save(hospitalized);

        diseaseRecord.setKeyword(keyword);
        diseaseRecord.setCard_medical(card_medical);
        diseaseRecord.setStatus(0);
        diseaseRecord.setCreate_date(new Date());
        diseaseRecordRepository.save(diseaseRecord);

        dischargeRecord.setKeyword(keyword);
        dischargeRecord.setCard_medical(card_medical);
        dischargeRecord.setStatus(0);
        dischargeRecord.setCreate_date(new Date());
        dischargeRecordRepository.save(dischargeRecord);

        checkRecord.setKeyword(keyword);
        checkRecord.setCard_medical(card_medical);
        checkRecord.setStatus(0);
        checkRecord.setCreate_date(new Date());
        checkRecordRepository.save(checkRecord);

        heartRateChart.setKeyword(keyword);
        heartRateChart.setCard_medical(card_medical);
        heartRateChart.setStatus(0);
        heartRateChart.setCreate_date(new Date());
        heartRateChartRepository.save(heartRateChart);

        transcranialDopplerReport.setKeyword(keyword);
        transcranialDopplerReport.setCard_medical(card_medical);
        transcranialDopplerReport.setStatus(0);
        transcranialDopplerReport.setCreate_date(new Date());
        transcranialDopplerReportRepository.save(transcranialDopplerReport);

        ultrasonicDiagnosisReport.setKeyword(keyword);
        ultrasonicDiagnosisReport.setCard_medical(card_medical);
        ultrasonicDiagnosisReport.setStatus(0);
        ultrasonicDiagnosisReport.setCreate_date(new Date());
        ultrasonicDiagnosisReportRepository.save(ultrasonicDiagnosisReport);

        videoReport.setKeyword(keyword);
        videoReport.setCard_medical(card_medical);
        videoReport.setStatus(0);
        videoReport.setCreate_time(new Date());
        videoReportRepository.save(videoReport);

        List<MedicalRecord> list= medicalRecordRepository.find_allmsg();
        return list;
    }

    @ResponseBody
    @RequestMapping("/nopass")
    public Map<String,Object> nopass(){

        List<MedicalRecord> list= medicalRecordRepository.find_one();
        Map<String,Object> map2=new HashedMap();
        //status=2,表示审核不通过

        if(list.isEmpty()){
            list = new LinkedList<>();
            map2.put("data",list);
        }
        map2.put("data",list);
        return map2;
    }

    //点击编辑,跳转录入页面
    @RequestMapping("/edit")
    public String edit(HttpServletRequest request, Model model){
        String keyword=request.getParameter("keyword");
//        System.out.println(keyword);

        List<MedicalRecord> listMedi = medicalRecordRepository.findByKeyword(keyword); //病案首页
        List<Hospitalized> listHosp = hospitalizedRepository.findByKeyword(keyword);   //入院记录
        List<DiseaseRecord> listDise = diseaseRecordRepository.findByKeyword(keyword);   //病程记录
        List<CheckRecord> listChec = checkRecordRepository.findByKeyword(keyword);         //查房记录
        List<DischargeRecord> listDisc = dischargeRecordRepository.findByKeyword(keyword);      //出院记录
        List<VideoReport> listVide = videoReportRepository.findByKeyword(keyword);          //各种影像
        List<UltrasonicDiagnosisReport> listUltr = ultrasonicDiagnosisReportRepository.findByKeyword(keyword); //超声波
        List<TranscranialDopplerReport> listTran = transcranialDopplerReportRepository.findByKeyword(keyword);   //多普勒


        if(listMedi.isEmpty()){
            System.out.println("keyword = "+keyword+"查找为空");
            return "case_search";
        }
        if(listTran.isEmpty()){
            System.out.println("listTran= "+keyword+"查找为空");
            model.addAttribute("listtran",null);
//            return "case_search";
        }else {
            model.addAttribute("listtran",listTran.get(0));  //多普勒
        }
        model.addAttribute("listmedi",listMedi.get(0));  //病案首页
        model.addAttribute("listhosp",listHosp.get(0));//入院记录
        model.addAttribute("listcour",listDise.get(0));  //病程记录
        model.addAttribute("listleav",listDisc.get(0)); //出院记录
        model.addAttribute("listchec",listChec); //查房记录
        model.addAttribute("listvide",listVide);       //各种影像
        model.addAttribute("listultr",listUltr);   //超声波

       return "Check_insert";
    }

    //病例数据录入
    //病案首页,点击保存
    @RequestMapping("/update_medicalRecord")
    @ResponseBody
    public Integer update_medicalRecord(@ModelAttribute MedicalRecord medicalRecord){

        //int id=Integer.parseInt(medicalRecord.getId());
         Integer i=0;
//        System.out.println("dddddddddddd"+medicalRecord.getKeyword());
          medicalRecordRepository.saveAndFlush(medicalRecord);

        return i;
    }

    //更新住院记录
    @RequestMapping("/update_hospitalized")
    @ResponseBody
    public int  update_hospitalized(@ModelAttribute Hospitalized hospitalized){
        int i=0;
   hospitalizedRepository.saveAndFlush(hospitalized);
        return i;
    }

    //更新病程记录
    @RequestMapping("/update_diseaseRecord")
    @ResponseBody
    public Integer update_diseaseRecord(@ModelAttribute DiseaseRecord diseaseRecord){
        Integer i=0;
     diseaseRecordRepository.saveAndFlush(diseaseRecord);
        return i;
    }

    //更新查房（首次）记录
    @RequestMapping("/update_checkRecord")
    @ResponseBody
    public Integer update_checkRecord(@ModelAttribute CheckRecord checkRecord){
        Integer i=0;
checkRecordRepository.saveAndFlush(checkRecord);
        return i;
    }

    //插入查房（新建查房记录后）记录
    @RequestMapping("/add_checkRecord")
    @ResponseBody
    public Integer add_checkRecord(@ModelAttribute CheckRecord checkRecord){
        Integer i=0;
         checkRecordRepository.save(checkRecord);
        return i;
    }
    //更新出院记录
    @RequestMapping("/update_dischargeRecord")
    @ResponseBody
    public Integer update_dischargeRecord(@ModelAttribute DischargeRecord dischargeRecord){
        Integer i=0;
        dischargeRecordRepository.saveAndFlush(dischargeRecord);
        return i;
    }

    //更新各种影像记录
    @RequestMapping("/update_videoRecord")
    @ResponseBody
    public Integer update_videoRecord(@ModelAttribute VideoReport videoReport){
        Integer i=0;
         videoReportRepository.saveAndFlush(videoReport);
        return i;
    }


    //插入各种影像记录（新建查房记录后）记录
    @RequestMapping("/add_videoRecord")
    @ResponseBody
    public Integer add_videoRecord(@ModelAttribute VideoReport videoReport){
        Integer i=0;
        videoReportRepository.save(videoReport);
        return i;
    }


    //更新超声波记录
    @RequestMapping("/update_ultrasoniciagnDosisRecord")
    @ResponseBody
    public Integer update_ultrasoniciagnDosisRecord(@ModelAttribute UltrasonicDiagnosisReport ultrasonicDiagnosisReport){
        Integer i=0;
        ultrasonicDiagnosisReportRepository.saveAndFlush(ultrasonicDiagnosisReport);
        return i;
    }

    //插入超声波记录
    @RequestMapping("/add_ultrasoniciagnDosisRecord")
    @ResponseBody
    public Integer add_ultrasoniciagnDosisRecord(@ModelAttribute UltrasonicDiagnosisReport ultrasonicDiagnosisReport){
        Integer i=0;
        ultrasonicDiagnosisReportRepository.save(ultrasonicDiagnosisReport);
        return i;
    }


    //更新多普勒记录
    @RequestMapping("/update_transcranialDopplerRecord")
    @ResponseBody
    public Integer update_transcranialDopplerRecord(@ModelAttribute TranscranialDopplerReport transcranialDopplerReport){
        Integer i=0;
        transcranialDopplerReportRepository.saveAndFlush(transcranialDopplerReport);
        return i;
    }


    //录入后，点击提交
    @RequestMapping("/insert_submit")
    public String insert_submit(HttpServletRequest request){
        int status= Integer.parseInt(request.getParameter("Fruit"));
        if(status==1){
            //录入完成，状态直接变成待审核,不可编辑
            status=3;
        }
            //录入未完成，仍可编辑status=0;

        String remarks=request.getParameter("remarks");
        String keyword=request.getParameter("keyword");
//        System.out.println(status+","+remarks);
          medicalRecordRepository.setStatusAndRemarks(status,remarks,keyword);
        return "newCreatedCase";
    }

}
