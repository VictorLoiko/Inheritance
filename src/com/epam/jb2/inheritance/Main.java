package com.epam.jb2.inheritance;

import com.epam.jb2.inheritance.basket.Basket;
import com.epam.jb2.inheritance.constants.Cover;
import com.epam.jb2.inheritance.entity.Appliance;
import com.epam.jb2.inheritance.entity.Goods;
import com.epam.jb2.inheritance.entity.implementation.*;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Goods book = new Book(1,"Book",120, Cover.DIPLOMA);
        Goods bookmark = new Bookmark(2,"Bookmark",140);
        Goods flower = new Flower(3,"Flower",30);
        Goods microwave = new Microwave(4,"Microwave",1205);
        Goods refrigerator = new Refrigerator(5,"Refrigerator",456);

        Appliance microwaveI = new Microwave(4,"Microwave",1205);
        System.out.println(microwaveI.getAppointment());

        basket.addGood(book);
        basket.addGood(bookmark);
        basket.addGood(flower);
        basket.addGood(microwave);
        basket.addGood(refrigerator);

        System.out.println(basket.receipt());

        System.out.println("############### Сортировочки ###############");
        System.out.println("По уменьшению id:");
        System.out.println(basket.decrementIdGoodsSort().toString());
        System.out.println("По увеличению цены:");
        System.out.println(basket.sortGoodsByPrice().toString());
        System.out.println("По увеличению id:");
        System.out.println(basket.incrementIdGoodsSort().toString());
    }
}
