package com.epam.jb2.inheritance.entity.implementation;

import com.epam.jb2.inheritance.entity.Goods;

public class Book extends Goods {
    public Book(int id, String name, double price) {
        super(id, name, price);
    }
}
