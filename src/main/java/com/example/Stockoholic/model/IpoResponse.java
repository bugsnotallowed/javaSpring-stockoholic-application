package com.example.Stockoholic.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class IpoResponse {

    private String name;
    private List<IPO> results;

    public List<IPO> getResults() {
        return results;
    }

    public void setResults(List<IPO> results) {
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static class IPO {

        public String getIssuer_Name() {
            return issuer_Name;
        }

        private void setIssuer_Name(String issuer_Name) {
            this.issuer_Name = issuer_Name;
        }

        @JsonProperty("issuer_name")
        private String issuer_Name;

        public String getPrimary_exchange(){
            return primary_exchange;
        }

        private void setPrimary_exchange(String primary_exchange){
            this.primary_exchange = primary_exchange;
        }

        @JsonProperty("primary_exchange")
        private String primary_exchange;


        public String getLast_updated() {
            return last_updated;
        }

        private void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
        }

        @JsonProperty("last_updated")
        private String last_updated;


        public int getHighest_offer_price() {
            return highest_offer_price;
        }

        private void setHighest_offer_price(int highest_offer_price) {
            this.highest_offer_price = highest_offer_price;
        }

        public int getLot_size() {
            return lot_size;
        }

        private void setLot_size(int lot_size) {
            this.lot_size = lot_size;
        }

        @JsonProperty("highest_offer_price")
        private int highest_offer_price;

        @JsonProperty("lot_size")
        private int lot_size;

        public int getTotal_offer_size() {
            return total_offer_size;
        }

        private void setTotal_offer_size(int total_offer_size) {
            this.total_offer_size = total_offer_size;
        }

        @JsonProperty("total_offer_size")
        private int total_offer_size;
    }

}
