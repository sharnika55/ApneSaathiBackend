package com.kef.org.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;




@SpringBootApplication(scanBasePackages = {"com.kef.org"})

public class KEFVolunteerApplication extends SpringBootServletInitializer  {

    public static void main(String[] args) {
        SpringApplication.run(KEFVolunteerApplication.class, args);
    }
}
