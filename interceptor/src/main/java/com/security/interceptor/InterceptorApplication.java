package com.security.interceptor;

import com.security.interceptor.config.CustomInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterceptorApplication {




	public static void main(String[] args) {
		SpringApplication.run(InterceptorApplication.class, args);
	}

}
