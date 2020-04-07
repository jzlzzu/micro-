package com.micro.microlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroLogApplication.class, args);
    }

}
