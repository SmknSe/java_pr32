package com.example.java_pr32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaPr32Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaPr32Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }
}
