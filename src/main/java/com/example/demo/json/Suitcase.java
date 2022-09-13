package com.example.demo.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Suitcase {
    private final int width;
    private final int height;
    private final int depth;
    private final int weight;


    @JsonCreator // need to use when not using a default constructor in a class -- this tells JSON how to manage this instance
    Suitcase(
            @JsonProperty("width") int width,
            @JsonProperty("height") int height,
            @JsonProperty("depth") int depth,
            @JsonProperty("weight") int weight
    ) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public int getDepth() { return depth; }

    public int getWeight() { return weight; }
}
