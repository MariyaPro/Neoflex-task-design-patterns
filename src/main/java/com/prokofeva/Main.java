package com.prokofeva;


import com.prokofeva.adapter.*;
import com.prokofeva.factory.Coffee;
import com.prokofeva.factory.CoffeeEnum;
import com.prokofeva.factory.CoffeeFactory;
import com.prokofeva.proxy.ConnectionDBProxy;
import com.prokofeva.singelton.Logger;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        - Singelton Создать класс логирования. Метод в нем должен
//        выводить имя переданного класса и дополнительную
//        информацию. ( Пример вывода в методе: Log info: 21.07.23 - TestClass - Some info)
        Logger logger = Logger.getInstance();
        BigDecimal bigDecimal = new BigDecimal("8.0900990");
        Map<String, String> map = new HashMap<>();
        logger.classLogg(bigDecimal, "Доп информация");
        logger.classLogg(map, "Дополнительная информация");

//        - Factory Создать класс кофе, от него наследовать два вида кофе,
//        в зависимости от того какой тип кофе мы хотим, создавать
//        именно его через фабрику. (espresso, americano)
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee1 = coffeeFactory.getCoffee(CoffeeEnum.AMERICANO);
        Coffee coffee2 = coffeeFactory.getCoffee(CoffeeEnum.ESPRESSO);

//        - Adapter Компьютер может читать информацию только с USB,
//                нужно прочитать через usb адаптер информацию с карты
//        памяти. (создаю карту, адаптер и с компьютера читаю)
        Computer computer = new Computer();
        Usb usb1 = new UsbDevice();
        computer.read(usb1);
        MemoryCard memoryCard = new MemoryCard();
        Usb usb2 = new UsbAdapter(memoryCard);
        computer.read(usb2);

//        - Proxy Создание класса который хранит название бд и
//        "подключается" к ней по полному url. Подключаться через proxy,
//                который добавляет к названию полный адрес. (через proxy
//        обращаюсь к названию бд, вижу строчку подключено
//        localhost:port/название бд)
        ConnectionDBProxy connectionDBProxy = new ConnectionDBProxy("название БД");
        connectionDBProxy.connect();
    }
}
