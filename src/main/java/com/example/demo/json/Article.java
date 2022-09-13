package com.example.demo.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Article {
    private String title;
    private String createdBy;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    @JsonProperty("created_by")
    public String getCreatedBy() { return createdBy; }

    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

}
