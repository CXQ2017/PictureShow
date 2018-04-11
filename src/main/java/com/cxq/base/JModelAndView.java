package com.cxq.base;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JModelAndView extends ModelAndView {

    public JModelAndView(String viewName) {
        super.setViewName(viewName);
    }

    public JModelAndView(String viewName, HttpServletRequest request, HttpServletResponse response) {

        super.setViewName(viewName);

        String contextPath = request.getContextPath().equals("/") ? "" : request.getContextPath();
        String webPath = CommUtil.getURL(request);
        String port = ":" + CommUtil.null2Int(Integer.valueOf(request.getServerPort()));

        super.addObject("CommUtil", new CommUtil());
        super.addObject("httpInclude", new HttpInclude(request, response));
        super.addObject("webPath", webPath);
    }
}
