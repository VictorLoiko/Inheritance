package com.epam.jb2.inheritance.basket;

import com.epam.jb2.inheritance.entity.Goods;

import java.util.*;

public class Basket {
    int id;
    List<Goods> goods = new ArrayList<>();

    public void addGood(Goods good){
        this.goods.add(good);
    }

    public List<Goods> incrementIdGoodsSort(){
        Collections.sort(goods);
        return goods;
    }

    public List<Goods> decrementIdGoodsSort() {
        Collections.sort(goods, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getId() < o2.getId()) return 1;
                else if (o1.getId() > o2.getId()) return -1;
                return 0;
            }
        });
        return goods;
    }

    public List<Goods> sortGoodsByPrice() {
        goods.sort((a, b) -> (int) (a.getPrice() - b.getPrice()));
        return goods;
    }

    public double totalPrice() {
        return goods.stream()
                .map(Goods::getPrice)
                .reduce(0., Double::sum);
    }

    public String receipt() {
        StringBuilder result = new StringBuilder();
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
