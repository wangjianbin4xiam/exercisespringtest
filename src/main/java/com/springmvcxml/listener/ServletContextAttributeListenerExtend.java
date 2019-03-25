package com.springmvcxml.listener;


import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 11:54
 */
public class ServletContextAttributeListenerExtend implements ServletContextAttributeListener {

    private static Logger log = Logger.getLogger(ServletContextAttributeListenerExtend.class.getClass());

    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        log.debug("==== ServletContext 中添加属性 ===="+scab.getName()+":"+scab.getValue());
        ServletContext sc = scab.getServletContext();
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {

    }
}
