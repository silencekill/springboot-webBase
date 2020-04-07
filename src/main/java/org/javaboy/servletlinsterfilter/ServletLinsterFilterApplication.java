package org.javaboy.servletlinsterfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
// 可以扫描servlet,filter,listener
@ServletComponentScan(basePackages = "org.javaboy.servletlinsterfilter")
public class ServletLinsterFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletLinsterFilterApplication.class, args);
    }

}
