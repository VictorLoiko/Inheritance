package com.epam.jb2.inheritance;

import com.epam.jb2.inheritance.basket.Basket;
import com.epam.jb2.inheritance.entity.Goods;
import com.epam.jb2.inheritance.entity.implementation.*;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Goods book = new Book(1,"Book",120);
        Goods bookmark = new Bookmark(2,"Bookmark",140);
        Goods flower = new Flower(3,"Flower",30);
        Goods microwave = new Microwave(4,"Microwave",1205);
        Goods refrigerator = new Refrigerator(5,"Refrigerator",456);

        basket.addGood(book);
        basket.addGood(bookmark);
        basket.addGood(flower);
        basket.addGood(microwave);
        basket.addGood(refrigerator);

        System.out.println(basket.receipt());
    }
}
