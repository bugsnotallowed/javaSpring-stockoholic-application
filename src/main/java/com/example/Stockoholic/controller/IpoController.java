package com.example.Stockoholic.controller;

import com.example.Stockoholic.model.IpoResp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class IpoController {

    @Value("${api.key2}")
    private String apiKey;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/search")
    public String getProfile(@RequestParam("name") String name, Model model) {
        //String url = "https://financialmodelingprep.com/api/v3/profile/"+name+"?apikey="+ apiKey;
        String url = "https://financialmodelingprep.com/api/v3/quote/"+name+"?apikey="+ apiKey;
        RestTemplate restTemplate = new RestTemplate();
        IpoResp[] IpoRespArray = restTemplate.getForObject(url, IpoResp[].class);

        if(IpoRespArray != null && IpoRespArray.length > 0) {
            IpoResp IpoResp = IpoRespArray[0];
//            model.addAttribute("name", IpoResp.get(0).getIssuer_Name());
//            model.addAttribute("primary_exchange", IpoResp.get(0).getPrimary_exchange());
//            model.addAttribute("last_updated", IpoResp.get(0).getLast_updated());
//            model.addAttribute("highest_offer_price", IpoResp.get(0).getHighest_offer_price());
//            model.addAttribute("lot_size", IpoResp.get(0).getLot_size());
//            model.addAttribute("total_offer_size", IpoResp.get(0).getTotal_offer_size());
//            String weatherIcon = "wi wi-owm-" + IpoResp.getWeather().get(0).getId();
//            model.addAttribute("weatherIcon", weatherIcon);


            model.addAttribute("symbol", IpoResp.getSymbol());
            model.addAttribute("price", IpoResp.getPrice());
            model.addAttribute("changes", IpoResp.getChanges());
            model.addAttribute("exchange", IpoResp.getExchange());
            model.addAttribute("name", IpoResp.getName());
            model.addAttribute("ChangesPercentage", IpoResp.getChangesPercentage());
            model.addAttribute("DayLow", IpoResp.getDayLow());
            model.addAttribute("DayHigh", IpoResp.getDayHigh());
            model.addAttribute("YearHigh", IpoResp.getYearHigh());
            model.addAttribute("YearLow", IpoResp.getYearLow());
            model.addAttribute("previousClose", IpoResp.getPreviousClose());
            model.addAttribute("pe", IpoResp.getPe());
//            model.addAttribute("sector", IpoResp.getSector());
//            model.addAttribute("currency", IpoResp.getCurrency());
//            model.addAttribute("description", IpoResp.getDescription());
        }else {
            model.addAttribute("error", "404 Error!");
        }

        return "Cprofile";
    }
}
