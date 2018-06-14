package com.cxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/14.
 */

@Controller
public class PictureController {


    @RequestMapping("/pictrue_list")
    public String PictrueList(){


        return "picture_list";
    }

}
