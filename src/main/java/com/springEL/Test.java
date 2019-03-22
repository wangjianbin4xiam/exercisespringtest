package com.springEL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringElConfig.class);
        SpringElConfig r = context.getBean(SpringElConfig.class);
        r.outputResource();
        context.close();
    }
}
