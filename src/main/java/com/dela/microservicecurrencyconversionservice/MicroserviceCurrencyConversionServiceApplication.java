package com.dela.microservicecurrencyconversionservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.dela.microservicecurrencyconversionservice.configs.feign")
public class MicroserviceCurrencyConversionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCurrencyConversionServiceApplication.class, args);
    }
    //  for sleuth
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}
