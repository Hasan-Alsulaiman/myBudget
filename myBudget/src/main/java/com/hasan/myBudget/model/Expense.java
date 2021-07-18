package com.hasan.myBudget.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Expense {
    int id;
    String name;

    public Expense(String name) {
        this.name = name;
    }

    public Expense(@JsonProperty("id") int id,
                   @JsonProperty("name")String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
