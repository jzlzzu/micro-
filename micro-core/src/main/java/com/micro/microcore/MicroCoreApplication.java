package com.micro.microcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroCoreApplication.class, args);
    }
}
