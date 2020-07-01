package com.leon.leesinbusinessshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LeesinBusinessShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeesinBusinessShopApplication.class, args);
    }

}
