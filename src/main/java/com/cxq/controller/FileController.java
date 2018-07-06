package com.cxq.controller;

/**
 * Created by Administrator on 2018/7/3.
 */

import com.cxq.base.FileUtil;
import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class FileController {

    @Autowired
    private PicturePropertyRepository picturePropertyRepository;

    @RequestMapping(value = "/uploadFolder", method = RequestMethod.POST)

    public JSONObject uploadFolder(String card_medical, String name, String times_hospitalized,String principal_diagnosis,String gender, MultipartFile[] folder) {
        JSONObject jsonObject=new JSONObject();
        List<String> list = FileUtil.saveMultiFile("D:/upload", folder);
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
            //导入后的status默认为0，标记后为1
            pictureProperty.setStatus(0);
            picturePropertyRepository.save(pictureProperty);

        }

        jsonObject.put("SUCCESS","上传成功");
        return jsonObject;
    }
}