package com.initbean;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @title:
 * @Description:验证初始化
 * @author: wangjb
 * @create: 2019-03-23 11:15
 */
public class BeanWayService {

    public void init(){
        System.out.println("====>BeanWayService --》使用@Bean方式：init初始化");
    }

    public BeanWayService(){
        System.out.println("====>初始化无参构造函数：BeanWayService");
    }

    public void destroy(){
        System.out.println("====>BeanWayService--》 使用@Bean方式：destroy销毁");
    }
}
