package com.leon.leesincommonserviceeruka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LeesinCommonserviceErukaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeesinCommonserviceErukaApplication.class, args);
    }

}
