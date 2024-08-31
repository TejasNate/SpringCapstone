package com.example.userplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class UserPlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserPlayApplication.class, args);
        System.out.println("Hello"); // Prints a message when the application starts
    }
}
