package de.firstproject;

class ClassB{
    public static void main(String [] args) {
            abs(5);
            abs(-10);
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
}