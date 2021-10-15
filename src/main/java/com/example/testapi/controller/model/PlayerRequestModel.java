package com.example.testapi.controller.model;

import com.example.testapi.persistence.model.Position;

public class PlayerRequestModel {
    private String name;
    private String club;
    private int age;
    private int market_value;
    private Position position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarket_value() {
        return market_value;
    }

    public void setMarket_value(int market_value) {
        this.market_value = market_value;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
