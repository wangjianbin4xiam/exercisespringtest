package com.initbean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @title:
 * @Description:验证初始化
 * @author: wangjb
 * @create: 2019-03-23 11:18
 */
public class JSR250WayService implements InitializingBean {

    @PostConstruct
    public void init(){
        System.out.println("====>JSR250WayService --》 使用JSR250完成初始化：init");
    }

    public JSR250WayService(){
        System.out.println("====>JSR250WayService 无参构造方法的执行");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("====>JSR250WayService --》 使用JSR250销毁：destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("====>JSR250WayService --》 使用InitializingBean：afterPropertiesSet");
    }
}
