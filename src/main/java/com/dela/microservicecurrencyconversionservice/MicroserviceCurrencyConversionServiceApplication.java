package com.dela.microservicecurrencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.dela.microservicecurrencyconversionservice.configs.feign")
public class MicroserviceCurrencyConversionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCurrencyConversionServiceApplication.class, args);
    }

}
