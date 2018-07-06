package com.cxq.upload;

import com.cxq.domain.PictureProperty;

import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
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

    public static List<PictureProperty> getPictureProperty(String path, String name, String gender,
                                                           String id_card, String principal_diagnosis, String only_id){

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
                pictureProperty.setCard_medical(id_card);
                pictureProperty.setCreatTime(new Date());
                pictureProperty.setKeyword(id_card+"_"+only_id);
                ls.add(pictureProperty);
            }else {
                System.out.printf("未识别文件");
            }
        }
        return ls;
    }

    //判断是否为PDF
    private static boolean isPDF(File file){
        boolean flag = false;
        String name = file.getName();
        String type = name.substring(name.lastIndexOf('.') + 1, name.length());
        if (type.toLowerCase().equals("pdf")){
            flag = true;
        }
        return flag;
    }

    //得到MD5值
    public static String getMD5(String message) {
        String md5str = "";
        try {
            // 1 创建一个提供信息摘要算法的对象，初始化为md5算法对象
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 2 将消息变成byte数组
            byte[] input = message.getBytes();

            // 3 计算后获得字节数组,这就是那128位了
            byte[] buff = md.digest(input);

            // 4 把数组每一字节（一个字节占八位）换成16进制连成md5字符串
            md5str = bytesToHex(buff);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5str;
    }

    /**
     * 二进制转十六进制
     *
     * @param bytes
     * @return
     */
    public static String bytesToHex(byte[] bytes) {
        StringBuffer md5str = new StringBuffer();
        // 把数组每一字节换成16进制连成md5字符串
        int digital;
        for (int i = 0; i < bytes.length; i++) {
            digital = bytes[i];

            if (digital < 0) {
                digital += 256;
            }
            if (digital < 16) {
                md5str.append("0");
            }
            md5str.append(Integer.toHexString(digital));
        }
        return md5str.toString().toUpperCase();
    }
}
