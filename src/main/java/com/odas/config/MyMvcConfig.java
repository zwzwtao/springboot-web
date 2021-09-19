package com.odas.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 扩展springmvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    // 视图跳转，就是输入某个路径会跳转到某个特定页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 输入/odas跳转到test页面
        // test页面一定要在templates下
        registry.addViewController("/odas").setViewName("test");
    }
}
