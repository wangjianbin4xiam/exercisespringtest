package com.initbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @title:
 * @Description:
 * @author: wangjb
 * @create: 2019-03-23 11:21
 */
@Configuration
@ComponentScan("com.initbean")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
