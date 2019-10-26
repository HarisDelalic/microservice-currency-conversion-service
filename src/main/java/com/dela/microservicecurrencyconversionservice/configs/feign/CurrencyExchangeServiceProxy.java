package com.dela.microservicecurrencyconversionservice.configs.feign;

import com.dela.microservicecurrencyconversionservice.models.CurrencyConversion;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="microservice-currency-exchange-service")
@RibbonClient(name="microservice-currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-converter/from/{from}/to/{to}")
    CurrencyConversion getExchangeValue(@PathVariable String from, @PathVariable String to);
}
