package com.ght.servicetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServicetestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServicetestApplication.class).web(true).run(args);
    }

}
