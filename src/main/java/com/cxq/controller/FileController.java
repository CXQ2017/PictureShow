package com.cxq.controller;

/**
 * Created by Administrator on 2018/7/3.
 */

import com.cxq.base.FileUtil;
import com.cxq.domain.MedicalRecord;
import com.cxq.domain.MedicalRecordRepository;
import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class FileController {

    @Autowired
    private PicturePropertyRepository picturePropertyRepository;

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Value("${configure.upload.local_path}")
    String upload_local_path;

    @Value("${configure.insert.upload.local_path}")
    String insert_upload_local_path;

    @RequestMapping(value = "/uploadFolder", method = RequestMethod.POST)

    public JSONObject uploadFolder(String card_medical, String name, String times_hospitalized, String principal_diagnosis, String gender, MultipartFile[] folder, HttpServletRequest request) {
        String user_id=request.getSession().getAttribute("userId").toString();
        Long userId=Long.parseLong(user_id);
        JSONObject jsonObject=new JSONObject();
        List<String> list = FileUtil.saveMultiFile(upload_local_path, folder);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {

            PictureProperty pictureProperty = new PictureProperty();
            pictureProperty.setPicture_path(list.get(i));
            pictureProperty.setCreatTime(new Date());
            pictureProperty.setCard_medical(card_medical);
            pictureProperty.setName(name);
            pictureProperty.setTimes_hospitalized(times_hospitalized);
            pictureProperty.setPrincipal_diagnosis(principal_diagnosis);
            pictureProperty.setGender(gender);
            pictureProperty.setKeyword(card_medical+"_"+times_hospitalized);
            pictureProperty.setUser_id(userId);

            //导入后的status默认为0，标记后为1
            pictureProperty.setStatus(0);
            picturePropertyRepository.save(pictureProperty);

        }

        jsonObject.put("SUCCESS","上传成功");
        return jsonObject;
    }

    @RequestMapping(value = "/insert_uploadFolder", method = RequestMethod.POST)
    //接受文件的名字一定要与页面上定义的名字一致，否则文件不能传过来
    public JSONObject InsertUploadFolder(String keyword,  MultipartFile[] folder){

        JSONObject jsonObject = new JSONObject();
        if (folder.length < 0 || folder==null){
            jsonObject.put("SUCCESS","上传失败");
            return jsonObject;
        }
        List<String> list = FileUtil.saveMultiFile(insert_upload_local_path,folder);
        System.out.println(list.get(0));
        if (list.isEmpty() || list.get(0)==null){
            jsonObject.put("SUCCESS","上传失败");
        }else {
            List<MedicalRecord> medicalRecord = medicalRecordRepository.findByKeyword(keyword);

            medicalRecord.get(0).setPdf_path(list.get(0));
            medicalRecordRepository.save(medicalRecord);
            jsonObject.put("SUCCESS", "上传成功");
        }
        return jsonObject;
    }


}