package com.example.xiaodexercise.domain;

import java.io.Serializable;

public class Video implements Serializable {

    public int id;

    public String tittle;

    public int price;

    public Video(int id, String tittle, int price) {
        this.id = id;
        this.tittle = tittle;
        this.price = price;
    }

    public Video(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                '}';
    }
}
