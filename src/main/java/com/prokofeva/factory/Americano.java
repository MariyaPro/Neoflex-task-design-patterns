package com.prokofeva.factory;

public class Americano extends Coffee {

    public Americano() {
        System.out.println("Подготовка Americano...");
    }

    @Override
    public void prepare() {
        System.out.println("Americano готов!");
    }
}
