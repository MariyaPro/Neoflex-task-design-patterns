package com.prokofeva.factory;

public class Espresso extends Coffee {

    public Espresso() {
        System.out.println("Подготовка Espresso...");
    }

    @Override
    public void prepare() {
        System.out.println("Espresso готов!");
    }
}
