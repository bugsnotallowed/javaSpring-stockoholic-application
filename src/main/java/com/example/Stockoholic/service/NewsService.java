package com.example.Stockoholic.service;

import com.example.Stockoholic.model.newsResp;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {

    @Value("${api.news.url}")
    private String newsApiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<newsResp> fetchNews() {
        List<newsResp> newsList = new ArrayList<>();
        try {
            String json = restTemplate.getForObject(newsApiUrl, String.class);
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(json);
            JsonNode dataArray = root.path("data");

            int count = 0;
            for (JsonNode node : dataArray) {
                if (count++ >= 15) break;
                newsResp news = new newsResp();
                news.setTitle(node.path("title").asText());
                news.setUrl(node.path("url").asText());
                news.setDescription(node.path("description").asText());
                news.setSource(node.path("source").asText());
                news.setPublished_at(node.path("published_at").asText());
                newsList.add(news);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return newsList;
    }
}
