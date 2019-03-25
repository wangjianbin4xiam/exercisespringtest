package com.initbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Controller;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-23 11:37
 */
@Controller
public class BanPostProcessService implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("我是在bean初始化之前做一些事情");
        if(o instanceof JSR250WayService){
            System.out.println("<=========JSR250WayService===========>");
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("我是在bean初始化之后做一些事情");
        return o;
    }
}
