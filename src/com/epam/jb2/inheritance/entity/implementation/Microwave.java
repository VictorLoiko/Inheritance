package com.epam.jb2.inheritance.entity.implementation;

import com.epam.jb2.inheritance.entity.Appliance;
import com.epam.jb2.inheritance.entity.Goods;

public class Microwave extends Goods implements Appliance {
    public Microwave(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String getAppointment() {
        return "Микроволновка необходима, чтобы разогревать еду";
    }
}
