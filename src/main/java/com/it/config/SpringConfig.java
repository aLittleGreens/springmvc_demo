package com.it.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.it.dao","com.it.service","com.it.exception"})   //精准扫描
//扫描后，排除
//@ComponentScan(value = "com.it", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class))
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement //开启事务
public class SpringConfig {

    //解析器，文件上传
//    @Bean
//    public MultipartResolver multipartResolver() {
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setDefaultEncoding("UTF-8");
//        multipartResolver.setMaxUploadSize(1024 * 1024);//1字节1024byte，1M
//        return multipartResolver;
//    }

}
