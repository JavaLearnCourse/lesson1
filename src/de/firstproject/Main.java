package de.firstproject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        int x = 7;
        System.out.println(x);
        System.out.println(x + x * x);
        System.out.println(x + " Euro");  //конкатенация
        String str1 = "Boo";
        System.out.println(str + " " +  str1);
        System.out.println("blabla " +  (2 + 2));
        // Если к строке прибавить что-то, то результат будет строкой
        double d1 = 5.7;
        System.out.println(d1 + " Euro");
        System.out.println(0.1 + 0.2);

        long y = 20_000_000_000l;
        float z = 5.6f;

    }
    /*
    Ссылочные типы данных
    1. Массив
    2. Класс
    3. Интерфейс
     */
}