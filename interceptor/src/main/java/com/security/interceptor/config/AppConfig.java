package com.security.interceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public CustomInterceptor customInterceptor()
    {
        return new CustomInterceptor();
    }
    @Autowired
    private NewCustomInterceptor newCustomInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(customInterceptor())
                .addPathPatterns("/api/*")
                .excludePathPatterns("/api/delete");
        registry.addInterceptor(newCustomInterceptor)
                .addPathPatterns("/api/*")
                .excludePathPatterns("/api/delete");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
