package com.prokofeva.factory;

public class CoffeeFactory {
    public CoffeeFactory() {
        System.out.println("CoffeeFactory");
    }

    public Coffee getCoffee(CoffeeEnum name) {

        if (name == null) {
            throw new IllegalArgumentException("Тип кофе не должен быть равен null.");
        }

        Coffee coffee;
        switch (name) {
            case AMERICANO -> coffee = new Americano();
            case ESPRESSO -> coffee = new Espresso();
            default -> throw new IllegalArgumentException("Неподдерживаемый тип кофе:" + name);
        }
        return coffee;
    }
}
