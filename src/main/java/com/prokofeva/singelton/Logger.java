package com.prokofeva.singelton;

//      - Singelton Создать класс логирования. Метод в нем должен
//      выводить имя переданного класса и дополнительную
//      информацию. (log info: FirstClass, SecondClass)

import java.time.LocalDate;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        String logInfo = String.join(" - ", LocalDate.now().toString(), obj.getClass().getSimpleName(), info);
        System.out.println("Log info: " + logInfo);
    }
}
