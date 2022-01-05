package com.epam.jb2.inheritance.entity.implementation;

import com.epam.jb2.inheritance.entity.Goods;
import com.epam.jb2.inheritance.constants.Cover;

public class Book extends Goods {
    Cover cover;
    public Book(int id, String name, double price, Cover cover) {
        super(id, name, price);
        this.cover = cover;
    }
}
