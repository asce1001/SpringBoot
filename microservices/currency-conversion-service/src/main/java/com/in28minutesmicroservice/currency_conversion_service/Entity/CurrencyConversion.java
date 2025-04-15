package com.in28minutesmicroservice.currency_conversion_service.Entity;



import java.math.BigDecimal;


public class CurrencyConversion {
    private Long id;
    private String from1;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculations;
    private String environment;

    public CurrencyConversion(Long id, String to, String from1, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculations, String environment) {
        this.id = id;
        this.to = to;
        this.from1 = from1;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculations = totalCalculations;
        this.environment = environment;
    }

    public CurrencyConversion(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfrom1() {
        return from1;
    }

    public void setfrom1(String from1) {
        this.from1 = from1;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculations() {
        return totalCalculations;
    }

    public void setTotalCalculations(BigDecimal totalCalculations) {
        this.totalCalculations = totalCalculations;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
