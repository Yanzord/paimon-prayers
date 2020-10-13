package com.github.yanzord.paimonprayers.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reward {

    @Id
    private String id;
    private String name;
    private int rating;

    public Reward() {}

    public Reward(String id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public Reward(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
