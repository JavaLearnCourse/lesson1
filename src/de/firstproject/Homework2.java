package de.firstproject;

public class Homework2 {

    public static void main(String[] args) {
        aufgabe9(-1,5, 9);
        //aufgabe10();
        //aufgabe11();
        aufgabe12(100, 46);
        //aufgabe13();
        //markaufgabe14(4);

    }
    /*
    sum = sum + i
    sum += i
     */
    public static void aufgabe9(int i, int x, int k) {
        int sum = 0;
        while(i<=x) {
            sum = sum + Math.abs(i);
            if(sum>k) {
                break;
            }
            i++;
        }
        System.out.println(sum);
    }


    public static void aufgabe10(int n){
        double res = Math.sqrt(2);
        for (int i = 0; i < n; i++) {
            res = Math.sqrt(2 + res);
        }
        System.out.println(res);
    }


    public static void aufgabe11(double n){
        double x = 2.;
        int i = 0;
        double sum = 0;
        while(i==n) {
            sum = sum + Math.sqrt(x);
            i++;
        }
        System.out.println(sum);
    }


    public static void aufgabe12(int a, int b){
        int r = -1;
        int res = 1;
        do {
            r = a % b;
            a = b;
            res = b;
            b = r;
        } while (r != 0);
        System.out.println("res = " + res);
    }


    //aufgabe13(2, 3)
    public static void aufgabe13(int x, int p){
        int prod = 1;
        for(int i = 0; i < p; i++) {
            prod =  x * prod;
        }
        System.out.println(prod);
    }


    public static void markaufgabe14(double x){
        String str = x + "";
        switch(str) {
            case "1.0":
                System.out.println("38-40");
                break;
            case "1.3":
                System.out.println("36-37.5");
                break;
            case "1.7":
                System.out.println("34-35.5");
                break;
            case "2.0":
                System.out.println("32-33.5");
                break;
            case "2.3":
                System.out.println("30-31.5");
                break;
            case "2.7":
                System.out.println("28-29.5");
                break;
            case "3.0":
                System.out.println("26-27.5");
                break;
            case "3.3":
                System.out.println("24-25.5");
                break;
            case "3.7":
                System.out.println("22-23.5");
                break;
            case "4.0":
                System.out.println("20-21.5");
                break;
            case "5.0":
                System.out.println("0-19.5");
                break;

        }
    }
}
