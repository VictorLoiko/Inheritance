package com.epam.jb2.inheritance.basket;

import com.epam.jb2.inheritance.entity.Goods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {
    int id;
    List<Goods> goods = new ArrayList<>();

    public void addGood(Goods good){
        this.goods.add(good);
    }

    public double totalPrice() {
        return goods.stream()
                .map(Goods::getPrice)
                .reduce(0., Double::sum);
    }

    public String receipt() {
        StringBuffer result = new StringBuffer();
        Map<String,String> fields = new HashMap<>();
        result.append("Покупка №").append(this.id).append("\n");
        result.append("Список товаров:\n");
        String format = "%15s: %,.2f р. \n";
        for (Goods good : goods) {
            result.append("#### ")
                    .append(String.format(format, good.getName(), good.getPrice()));
        }
        result.append("Итого: ").append(totalPrice()).append("\n");
        return result.toString();
    }


}
