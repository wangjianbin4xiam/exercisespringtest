package com.springmvcxml.dispatcher;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 15:33
 */
public class DispatcherServletExtend extends DispatcherServlet {
    private static Logger log = Logger.getLogger(DispatcherServletExtend.class.getClass());

    @Override
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.debug("=== 请求进入 DispatcherServletExtend 的 doService 方法");
        super.doService(request, response);
    }
}
