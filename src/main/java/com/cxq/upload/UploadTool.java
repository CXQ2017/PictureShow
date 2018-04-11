package com.cxq.upload;

import com.cxq.domain.PictureProperty;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Administrator on 2018/3/5.
 */
public class UploadTool implements UploadInterface{


    //判断系统
    @Override
    public String getOSName() {
        Properties props = System.getProperties();
        String osName = props.getProperty("os.name").split(" ")[0];
        return osName;
    }

    //检查文件夹是否为空
    @Override
    public boolean checkFolder(String floderPath) {


            return false;
    }

    public static List<PictureProperty> getPictureProperty(String path, String name, Integer gender,
                                                           Integer id_card, String principal_diagnosis, Long only_id){

        List<PictureProperty> ls = new ArrayList<>();
        File root = new File(path);
        File[] files = root.listFiles();
        for(File file:files){
            if(file.isDirectory()){
                ls.addAll(getPictureProperty(path, name, gender, id_card, principal_diagnosis, only_id));
            }else if(isPDF(file)){
                PictureProperty pictureProperty = new PictureProperty();
                String path_name = file.toString();
                pictureProperty.setPicture_path(path_name);
                pictureProperty.setName(name);
                pictureProperty.setGender(gender);
                pictureProperty.setIdentity_card(id_card);
                pictureProperty.setPrincipal_diagnosis(principal_diagnosis);
                pictureProperty.setOnly_id(only_id);
                ls.add(pictureProperty);
            }else {
                System.out.printf("未识别文件");
            }
        }
        return ls;
    }

    private static boolean isPDF(File file){
        boolean flag = false;
        String name = file.getName();
        String type = name.substring(name.lastIndexOf('.') + 1, name.length());
        if (type.toLowerCase().equals("pdf")){
            flag = true;
        }
        return flag;
    }
}
