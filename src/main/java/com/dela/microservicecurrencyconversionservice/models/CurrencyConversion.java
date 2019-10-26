package com.dela.microservicecurrencyconversionservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
public class CurrencyConversion {
    @Getter @Setter private Long id;
    @Getter @Setter private String from;
    @Getter @Setter private String to;
    @Getter @Setter private BigDecimal conversionMultiple;
    @Getter @Setter private BigDecimal quantity;
    @Getter @Setter private BigDecimal totalCalculatedAmount;
    @Getter @Setter private Integer port;

    public CurrencyConversion(String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, Integer port) {
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }
}
