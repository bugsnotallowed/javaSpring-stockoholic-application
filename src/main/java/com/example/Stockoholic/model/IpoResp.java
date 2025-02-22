package com.example.Stockoholic.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IpoResp {

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("price")
    private String price;

    @JsonProperty("changes")
    private String changes;

//    @JsonProperty("companyName")
//    private String companyName;

    @JsonProperty("name")
    private String name;

    @JsonProperty("exchange")
    private String exchange;

    public String getChangesPercentage() {
        return changesPercentage;
    }

    public void setChangesPercentage(String changesPercentage) {
        this.changesPercentage = changesPercentage;
    }

    public String getDayLow() {
        return dayLow;
    }

    public void setDayLow(String dayLow) {
        this.dayLow = dayLow;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public String getDayHigh() {
        return dayHigh;
    }

    public void setDayHigh(String dayHigh) {
        this.dayHigh = dayHigh;
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe;
    }

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    @JsonProperty("changesPercentage")
    private String changesPercentage;

    @JsonProperty("dayLow")
    private String dayLow;

    @JsonProperty("yearLow")
    private String yearLow;

    @JsonProperty("yearHigh")
    private String yearHigh;

    @JsonProperty("dayHigh")
    private String dayHigh;

    @JsonProperty("pe")
    private String pe;

    @JsonProperty("previousClose")
    private String previousClose;
}
