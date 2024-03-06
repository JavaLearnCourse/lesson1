package de.firstproject;

import java.util.Arrays;

public class DemoString {


    public static void main(String[] args) {
        String str = "Hello";

        System.out.println(str);
        //можно сделать большие буквы
        System.out.println(str.toUpperCase());
        //можно сделать маленькие буквы
        System.out.println(str.toLowerCase());
        //можно узнать длину строки
        System.out.println(str.length());
        //можно вырезать какую--то подстроку
        System.out.println(str.substring(0, 2));
        //Пример
        String str2 = "Generate random RGB values for each pixel";
        System.out.println(str2.substring(0,7) +"...");
        String str3 = "JavabDFNFNFGNAGFMZ FFFB fdbbdn adfnffbSSSDGVD!";
        System.out.println(str3.substring(0, str3.length() - 1));
        //a[a.length - 1]
        char c = 'C';

        char c1 = 'C';
        char ch = str3.charAt(1);
        System.out.println(ch);
       /* for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));
        }*/
        /*
            Приведение типов

         */
        int x = 5; //32 bit  000000000000000000.......101
        long d = x;//64    000000000000000000000000000000000000........101
        int y = (int)d; // 32 bit
        /*
        
        В компьютере все есть число
         */

        int a = ch;
        System.out.println("a = " + a + "  " + ch);
        int b  = a + 1;
        char ch1 = (char) b;
        System.out.println("b = " + b  + " " + ch1);
        //
        /*
           int x = 5;

          if (x === 5)
          1. ==
          2. у ссылочных есть два разных сравнения
            2.1 == проверка ссылки



            Структура примитивных типов
            int x = 5;
            тип переменная = значение

            Структура ссылочных типов
            тип ссылка = значение

            2.2  проверка равества по-существу
            equals
         */

        String str11 = "Hello";
        String str12 =  "Hello";
        System.out.println(str11.equals(str12));
        int a1 [] = {3,4};
        int a2 [] = {3,4};

        int a3[] = a1;
        System.out.println(a1 == a3);
        System.out.println(Arrays.equals(a1, a2));


        /*
        Строка является иммутабельным типом
        вызом любого метода у строке не оказывает влияние на исходную строку
        для работы с результатом метода нужно присвоить новой строке

         */

        String str14 = "abcdefg";
        System.out.println(str14.substring(0, 3));
        System.out.println(str14);

        String result = str14.substring(0, 3);
        System.out.println(result);
    }
}
