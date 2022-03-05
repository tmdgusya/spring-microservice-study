package com.example.eurekaservicestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceStudyApplication.class, args);
    }

}
