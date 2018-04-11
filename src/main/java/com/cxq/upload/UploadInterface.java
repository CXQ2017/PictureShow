package com.cxq.upload;

/**
 * Created by Administrator on 2018/3/5.
 */
public interface UploadInterface {

    //判断系统
    public String getOSName();

    //检查文件夹是否为空
    public boolean checkFolder(String floderPath);


}
