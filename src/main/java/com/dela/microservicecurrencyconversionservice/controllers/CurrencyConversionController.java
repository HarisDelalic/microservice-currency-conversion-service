package com.dela.microservicecurrencyconversionservice.controllers;

import com.dela.microservicecurrencyconversionservice.configs.feign.CurrencyExchangeServiceProxy;
import com.dela.microservicecurrencyconversionservice.models.CurrencyConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeServiceProxy proxy;

    @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        CurrencyConversion currencyConversion = proxy.getExchangeValue(from, to);
        return new CurrencyConversion(from, to, currencyConversion.getConversionMultiple(), quantity,
                currencyConversion.getConversionMultiple().multiply(quantity), currencyConversion.getPort());
    }
}
