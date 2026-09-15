package com.flames.flames.dto;
public class LoveResponse {

    private String name1;
    private String name2;
    private int percentage;

    public LoveResponse(String name1, String name2, int percentage) {
        this.name1 = name1;
        this.name2 = name2;
        this.percentage = percentage;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getPercentage() {
        return percentage;
    }
}
