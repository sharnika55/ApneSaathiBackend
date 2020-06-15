package com.kef.org.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.kef.org"})


public class KEFVolunteerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KEFVolunteerApplication.class, args);
    }
}
