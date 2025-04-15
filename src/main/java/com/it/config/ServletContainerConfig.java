package com.it.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

@Configuration
public class ServletContainerConfig extends AbstractDispatcherServletInitializer {

    //SpringMvc 容器 表现层配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringMvcConfig.class);
        return applicationContext;
    }

    //哪些请求交给springmvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //所有请求
    }

    //Spring 容器，service dao层配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    //设置post 编码格式为utf-8
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        return new Filter[]{characterEncodingFilter};
    }
}
