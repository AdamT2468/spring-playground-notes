package com.example.demo.json;

public class Blog {
    private String title;
    private Article[] articles;

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public Article[] getArticles() { return articles; }

    public void setArticles(Article[] articles) { this.articles = articles; }
}
