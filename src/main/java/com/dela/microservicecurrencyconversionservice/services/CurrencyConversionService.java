package com.dela.microservicecurrencyconversionservice.services;

import com.dela.microservicecurrencyconversionservice.models.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class CurrencyConversionService {
    private static final String CURRENCY_EXCHANGE_URL = "http://localhost:8000/currency-converter/from/{from}/to/{to}";

    public CurrencyConversion getCurrencyConversion(String from, String to) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CurrencyConversion> currencyConversionResponseEntity =
                restTemplate.getForEntity(CURRENCY_EXCHANGE_URL, CurrencyConversion.class, currencyExchangeUrlParams(from, to));
        return currencyConversionResponseEntity.getBody();
    }

    private Map<String, String> currencyExchangeUrlParams(String from, String to) {
        Map<String, String> currencyConversionMap = new HashMap<>();
        currencyConversionMap.put("from", from);
        currencyConversionMap.put("to", to);
        return currencyConversionMap;
    }
}
