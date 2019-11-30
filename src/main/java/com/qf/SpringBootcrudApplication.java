package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by ding on 2019/11/27.
 */
@SpringBootApplication
public class SpringBootcrudApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(SpringBootcrudApplication.class,args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootcrudApplication.class);
    }
}
