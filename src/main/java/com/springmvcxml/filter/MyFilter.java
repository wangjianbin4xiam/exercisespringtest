package com.springmvcxml.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 14:58
 */
public class MyFilter implements Filter {
    private static Logger log = Logger.getLogger(MyFilter.class.getClass());
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String name = filterConfig.getInitParameter("userName");
        String password = filterConfig.getInitParameter("passWord");
        log.debug("=== MyFilter 初始化 === 获取初始化参数： name:"+name+";passWord:"+password);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        log.debug("《----- 进入过滤器 -----》");

        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
