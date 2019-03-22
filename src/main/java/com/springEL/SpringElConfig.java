package com.springEL;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.springEL")
@PropertySource("classpath:test.properties")
public class SpringElConfig {

    //普通字符串
    @Value("i love you")
    private String normal;

    //操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //计算表达式
    @Value("#{T(java.lang.Math).random()*100}")
    private double randomNumber;

    //注入其他bean属性
    @Value("#{demoService.anothor}")
    private String fromAnother;

    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;

    //注入文件资源
    @Value("classpath:test.properties")
    private Resource testFile;

    //注入配置文件
    @Value("${book.name}")
    private String bookName;

    /**
     * 注入的properties可以从Environment获取
     */
    @Autowired
    private Environment environment;

    /**
     * 注入配置文件，如果使用@Value方式，则需要注入一个PropertySourcesPlaceholderConfigurer
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println("============================>");
            System.out.println("普通字符串="+normal);
            System.out.println("操作系统属性="+osName);
            System.out.println("计算表达式="+randomNumber);
            System.out.println("demoService.anothor = "+fromAnother);
            System.out.println("classpath:test.properties = "+IOUtils.toString(testFile.getInputStream()));
            System.out.println("url="+IOUtils.toString(testUrl.getInputStream()));
            System.out.println("${book.name}="+bookName);
            System.out.println("environment="+environment.getProperty("book.anothor"));

            System.out.println("<============================");
        }catch (Exception e){

        }
    }

}
