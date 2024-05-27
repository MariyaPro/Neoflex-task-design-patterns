package com.prokofeva.factory;

public class CoffeeFactory {
    public CoffeeFactory() {
        System.out.println("CoffeeFactory");
    }

    public Coffee getCoffee(CoffeeEnum name) {
        Coffee coffee;
        switch (name) {
            case AMERICANO -> coffee = new Americano();
            case ESPRESSO -> coffee = new Espresso();
            default -> throw new IllegalArgumentException("Что-то пошло не так.");
        }
        return coffee;
    }
}
