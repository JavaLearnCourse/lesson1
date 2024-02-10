package de.firstproject;

import java.util.Scanner;

class ClassB{
    public static void main(String [] args) {
            //tesk1(1, 5);
            int x = 0;
        Scanner sc = new Scanner(System.in);
        int a;
       do {
            System.out.println("Input a number");
            a = sc.nextInt();

        } while (a != -1);

        for (int i = 0,  j = 0; i < 5  &&  j < 3 ; i += 15, j = j * 3  ) {

        }
    }
   public static void abs(int x) {
        if(x>0) {
            System.out.println(x);
        } else {
            System.out.println(-x);
        }
    }


    public static void whatIsNumber(int x) {
       if (x > 0) {
           System.out.println("Posivite Number");
       }
    }


    public static void square(double radius) {
        double a = Math.PI * Math.pow(radius, 2); //double a = 3.14 * radius^2;
        // Math.pow(radius, 2)
        System.out.println(a);
    }


    public static void methode1(int a, int b) {
        if(a  >  b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    //Метод, который принимает  два числа(границы диапазона) и суммирует
    // Все отрицательные, если есть, и только нечетные положительные
    // Пример a = -5  b = 7
     // -5 -4 -3 -2 -1  1 3 5 7
    public static void tesk1(int a, int b ){
        int i = a;
        int sum = 0;
        while (i <= b) {
            if (i < 0 ||  i %  2 != 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println(sum);
    }

}