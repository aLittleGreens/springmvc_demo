package com.it.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 在控制器方法执行之前调用
        System.out.println("MyInterceptor Pre Handle method is Calling:"+handler);
        // 可以在这里进行权限验证等操作
        // 如果返回false，则中断请求
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 在控制器方法执行之后，视图渲染之前调用
        System.out.println("MyInterceptor Post Handle method is Calling:"+modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 在整个请求完成之后调用，即视图渲染完毕之后
        System.out.println("MyInterceptor Request and Response is completed");
    }
}