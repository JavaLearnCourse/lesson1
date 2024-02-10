package de.firstproject;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {

        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    // Перегрузка методов. 2 и более метода называются перегруженными (Überladen), если
    // у них одинаковое название, но разное количество и (или) типы данныъ

    public static void hello() {
        System.out.println("Hello");
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void max(int a, int b) {
        System.out.println("Алгоритм ищет максимальное число среди " + a + " и " + b);
        if (a > b) {
            System.out.println(a);

            /*
            Код на 100 строк
             */
        } else {
            System.out.println(b);
        }
        // Альтернатива: Тернарный Оператор
        // Условие ? результат, если истина : результат, если ложь
    }

    public static void max(double a, double b) {
        double result = a > b ? a : b;
        System.out.println(result);
        System.out.println("Алгоритм ищет максимальное число среди " + a + " и " + b);
    }

    /*
       && - И
       || - ODER
       ^  XOR  a ^ b d.h (a && !b) || (!a && b)
       == gleich
       != ungleich
     */
    public static void someMethod(int a, int b) {
        if (a > 100 && a < 1000 && b % 2 == 0) {
            System.out.println("IF");
        }
    }

    // Метод, которыйй юы печатал числа от i до x / i и х - параметры (произвольные числа)
    // i = 5  x = 9

    // 5 6 7 8 9
    public static void main1(int i, int x) {
        if (i > x) {
            System.out.println("Упс! Невозможно запустить цикл");
        } else
            while (i < x) {
                System.out.println(i); // 5 6 7 8
                i = i + 1;
            }
    }

}
