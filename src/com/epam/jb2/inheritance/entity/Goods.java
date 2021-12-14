package com.epam.jb2.inheritance.entity;

public class Goods {
    int id;
    String name;
    double price;

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
