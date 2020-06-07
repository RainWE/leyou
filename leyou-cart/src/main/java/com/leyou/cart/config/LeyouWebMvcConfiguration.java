package com.leyou.cart.config;

import com.leyou.cart.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置类
 * 配置拦截器，注册拦截器
 */
@Configuration
public class LeyouWebMvcConfiguration implements WebMvcConfigurer {
    //需要@component放入容器
    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 拦截器注册器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
    }
}
