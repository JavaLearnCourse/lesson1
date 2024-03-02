package de.firstproject;

public class Homework {



    public static int sum(int i, int x) {
        int sum = 0;
        while(i <= x) {
            sum = sum + i;
            i++;
        }
       return sum;
    }
    public void modifySum(int i,  int x) {
        int sum = sum(i, x);
        System.out.println(sum);
        if(sum % 3 == 0) {
            System.out.println(sum*sum);
        } else if(sum % 3 == 1) {
            System.out.println(sum*sum*sum);
        }
        else {
            System.out.println(sum);
        }
    }

    public static void printNumbers(int x){
        int i = 0;
        while (i < x){
            System.out.println(i) ;
            i++;
        }
        while(x < 0) {
            System.out.println(x);
            x++;
        }
    }

    public static void printN(int x) {
        int start = 0;
        int end = x;
        if (x < 0) {
            start = x;
            end = 0;
        }
        while (start < end) {
            System.out.println(start);
            start++;
        }
    }


    public static void euer(int k) {
        double sum = 0;
        int n = 1;
        int i = 1;
        while (i < k) {
            sum = sum + 1. / n;
            n = n * i;
            i++;
        }
        System.out.println(sum);
    }

    public static void sumNumbers (int n , int k ) {
        int sum = 0;

        for ( int i = 0; i < n ; i  = i + 2) {
            if ( sum > k ) {
                break ; //Останавливает цикл
            }

            sum += i ;

        }
        System . out . println ("Сумма равна " + sum );

    }

    public static void daysOfWeek (int d ) {

        switch ( d ) {
            case 1:
                System.out.println ("Понедельник");
             break ;
            case 2:
                System.out.println ("Вторник");
                break ;
            case 3:
                System.out.println ("Среда");
                break ;
            case 4:
                System . out . println ("Четверг");
                break ;
          case 5:
                System . out . println ("Пятница");
          case 6:
                    System . out . println ("Суббота");

         case 7:

                System . out . println ("Воскресенье");
            default:
                System.out.println("Неправильное число");
        }
         }

    public static void main(String[] args) {
   daysOfWeek(16);

    }
}
