package com.example.Stockoholic.model;

import java.util.ArrayList;

public class newsResp {
    private String title;
    private String url;
    private String description;
    private String source;
    private String published_at;

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getPublished_at() { return published_at; }
    public void setPublished_at(String published_at) { this.published_at = published_at; }
}

