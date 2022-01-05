package com.epam.jb2.inheritance.entity;

import java.util.Objects;

public class Goods implements Comparable<Goods> {
    int id;
    String name;
    double price;

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return id == goods.id && Double.compare(goods.price, price) == 0 && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}' + '\n';
    }

    @Override
    public int compareTo(Goods o) {
        if (this.id > o.getId()) return 1;
        else if (this.id < o.getId()) return -1;
        return 0;
    }
}
