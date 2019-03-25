package com.initbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-23 11:23
 */
public class Test {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(PrePostConfig.class);
//        BeanWayService beanWayService = c.getBean(BeanWayService.class);
//        JSR250WayService jsr250WayService = c.getBean(JSR250WayService.class);
        c.close();
    }
}
