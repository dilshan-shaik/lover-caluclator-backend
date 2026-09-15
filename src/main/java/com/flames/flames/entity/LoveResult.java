package com.flames.flames.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "love_results")
public class LoveResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name1;
    private String name2;
    private int percentage;

    public LoveResult() {
    }

    public LoveResult(String name1, String name2, int percentage) {
        this.name1 = name1;
        this.name2 = name2;
        this.percentage = percentage;
    }

    public Long getId() {
        return id;
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

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}