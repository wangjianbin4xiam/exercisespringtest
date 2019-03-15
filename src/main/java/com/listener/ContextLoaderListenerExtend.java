package com.listener;

import org.apache.log4j.Logger;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 15:35
 */
public class ContextLoaderListenerExtend extends ContextLoaderListener {
    private static Logger log = Logger.getLogger(ContextLoaderListenerExtend.class.getClass());

    /**
     * 在这个方法中，spring会初始 化一个启动上下文，这个上下文被称为根上下文，即WebApplicationContext，
     * 这是一个接口类，确切的说，其实际的实现类是 XmlWebApplicationContext,
     * 这个就是spring的IoC容器，其对应的Bean定义的配置由web.xml中的 context-param标签指定
     * @param event
     */
    @Override
    public void contextInitialized(ServletContextEvent event) {
        log.debug("===  进入ContextLoaderListenerExtend ；重写 contextInitialized ===");
        super.contextInitialized(event);
    }
}
