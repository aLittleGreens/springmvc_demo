package com.it.config;

import com.it.interceptor.LogInterceptor;
import com.it.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor())
                .addPathPatterns("/**")
                .order(1); // 数字越小优先级越高

        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/books","/books/*");
//                .addPathPatterns("/**")          // 拦截所有路径

//                .excludePathPatterns("/book");   // 排除登录路径


    }
}