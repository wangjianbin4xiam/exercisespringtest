package com.listener;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**ServletContextListener 接口，它能够监听 ServletContext 对象的生命周期，实际上就是监听 Web 应用的生命周期。
 * 当Servlet 容器启动或终止Web 应用时，会触发ServletContextEvent 事件，该事件由 ServletContextListener 来处理。


 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-15 11:52
 */
public class ServletContextListenerExtend implements ServletContextListener {
    private static Logger log = Logger.getLogger(ServletContextListenerExtend.class.getClass());

    /**
     * 当Servlet 容器启动Web 应用时调用该方法。
     * 在调用完该方法之后，容器再对Filter 初始化，并且对那些在Web 应用启动时就需要被初始化的Servlet 进行初始化
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.debug("===进入 ServletContextListener 初始化方法==");
        ServletContext sc = servletContextEvent.getServletContext();
        sc.setAttribute("local","我是在容器初始化的时候被赋值的");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.debug("===进入 contextDestroyed 方法 ==");
    }
}
