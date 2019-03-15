package com.listener;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 14:29
 */
public class HttpSessionListenerExtend implements HttpSessionListener {
    private static Logger log = Logger.getLogger(HttpSessionListenerExtend.class.getClass());
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.debug("=== HttpSessionListener ===");
        ServletContext sc = se.getSession().getServletContext();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}
