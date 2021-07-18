package com.hasan.myBudget.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
    int id, amount;
    String type, description, date;

    public Entry(@JsonProperty("amount") int amount,
                 @JsonProperty("type") String type) {
        this.amount = amount;
        this.type = type;
    }

    public Entry(int id,
                 @JsonProperty("amount")int amount,
                 @JsonProperty("type")String type,
                 @JsonProperty("description")String description,
                 String date) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
