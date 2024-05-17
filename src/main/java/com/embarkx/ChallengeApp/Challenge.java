package com.embarkx.ChallengeApp;

public class Challenge {
    private  Long id;
    private  String month;
    private String description;

    public Challenge(Long id, String description, String month) {
        this.id = id;
        this.description = description;
        this.month = month;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}