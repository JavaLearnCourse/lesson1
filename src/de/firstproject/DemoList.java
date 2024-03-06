package de.firstproject;

import java.util.ArrayList;
import java.util.List;

public class DemoList {


    public static void main(String[] args) {
        int[] a= {3,4,2,7,6,8, 7, 6,5,1};
        //список
        List<Integer> list = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        //List<int> list3 = new ArrayList<>(); Ошибка
        /*
            int -> Integer

            double -> Double

            boolean -> Boolean
         */

        //Методы
        // size() - количество элементов
        //  add(что-то)- добавить что-то в конец списка
        //get(index) - обращние по индексу к элементу как в массиве a[i]
        //clear() - удалить все
        list.add(5);
        list.add(75);
        for (int i = 0; i < 500_000; i++) {
            list.add(i);
        }


        method(list);

    }

    public static void method(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
