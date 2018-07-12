package com.cxq.base;

/**
 * Created by Administrator on 2018/7/3.
 */

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    /**
     * 在basePath下保存上传的文件夹
     * @param basePath
     * @param files
     */

    public static List<String> saveMultiFile(String basePath, MultipartFile[] files) {
        List<String> list = new ArrayList();

        if (files == null || files.length == 0) {
            return list;
        }
        if (basePath.endsWith(File.separator)) {
            basePath = basePath.substring(0, basePath.length() - 1);
        }

        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename().replace("/",File.separator);

            String filePath = basePath + File.separator + fileName;
            list.add(filePath);
            makeDir(filePath);
            File dest = new File(filePath);
            System.out.println(filePath);
            try {
                file.transferTo(dest);
            } catch (IllegalStateException | IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    /**
     * 确保目录存在，不存在则创建
     * @param filePath
     */
    private static void makeDir(String filePath) {
        if (filePath.lastIndexOf(File.separator) > 0) {
            String dirPath = filePath.substring(0, filePath.lastIndexOf(File.separator));
            File dir = new File(dirPath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
        }
    }
}