package de.firstproject;

public class Homework3 {
    public static void main(String[] args) {
        int a[] = {1,2,1};
        int b [] = {8,1};
        aufgabe19(a, b);

    }

    public static void aufgabe15(int [] a) {

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                sum = sum + a[i];
            }
        }
        System.out.println("aufgabe15 = " + sum);
    }

    public static void aufgabe16(int a[]) {

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            if(i % 2 == 0 && i != 0) {
                sum = sum + a[i];
            }
        }
        System.out.println("aufgabe16 = " + sum);
    }

    public static void aufgabe17(int [] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int max2 = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) continue;
            if (a[i] > max2 ) {
                max2 = a[i];
            }
        }
        System.out.println("aufgabe17 = " + max2);
    }

    public static void aufgabe18(int []a) {

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("aufgabe18 = " + sum/ a.length);
    }

    public static void aufgabe19(int a[], int b[]) {

        for (int i = b.length - 1; i >= 0; i--){
            int sum1 = 0;
            for (int j = a.length - 1, k = 0; j >= 0; j--, k++) {
                sum1 = sum1 + b[i] * a[j] * (int)Math.pow(10,k);
            }
            System.out.println("-------" + sum1);
        }
    }
    public static void aufgabe23() {
        int[][] a ={{1,4}, {6,9}};
        int[][] b ={{3,0}, {7,1}};
        for(int i = 0, j = 0; i < a.length && j < a.length ; j++) {
            System.out.println(a[i][j]+b[i][j]);
        }
        for(int i = 1, j = 0; i < a.length && j < a.length ; j++) {
            System.out.println(a[i][j]+b[i][j]);
        }
    }

}
