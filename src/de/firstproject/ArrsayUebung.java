package de.firstproject;

public class ArrsayUebung {

    public static void main(String[] args) {


        int [] a = new int[3];
        a[0] = 5;
        a[1] = -3;
        a[2] = 2;

        method1(a);
        printArray(a);
//        method1(a);
////        System.out.println("-------------------");
////        printArray(a);
////        swap(a, 1, 2);
////        System.out.println("-------------------");
//       printArray(a);
//
//       int c[] = {};
//        max(c);


           /*
    Ссылочные типы данных
    1. Массив
    2. Класс
    3. Интерфейс
     */

        // null - Объекта не существует
    }
    public static void swap(int a[], int i, int j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
    }

    public static  void max(int [] a) {
        if (a == null  || a.length == 0) {
            return;
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);

    }
    public static void method1(int[] a) {
        a[0] = 54;

    }

    public static void method(int x) {
        x = 17;
    }
    public static void printArray(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
    public static void printArrayReverse(int [] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
