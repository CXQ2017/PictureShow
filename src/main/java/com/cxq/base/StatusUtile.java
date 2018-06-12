package com.cxq.base;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/11/011.
 */
public class StatusUtile {

        public static final Map<String,String> mapStatus = new LinkedHashMap<String,String>(){{
            put("0","待审核");
            put("1","审核通过");
            put("2","审核未通过");
        }};




}
