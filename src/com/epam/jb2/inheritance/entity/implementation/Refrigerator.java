package com.epam.jb2.inheritance.entity.implementation;

import com.epam.jb2.inheritance.entity.Appliance;
import com.epam.jb2.inheritance.entity.Goods;

public class Refrigerator extends Goods implements Appliance {
    public Refrigerator(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getAppointment() {
        return "Холодильник нужен, чтобы охлаждать еду";
    }
}
