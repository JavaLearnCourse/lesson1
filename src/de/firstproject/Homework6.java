package de.firstproject;

public class Homework6 {


    public static void main(String[] args) {
        String s1 = "a";
        String s2= "abb";
        System.out.println(s1.compareTo(s2));
    }



    public static void aufgabe18(int a[]) {
         for(int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }



    public static void aufgabe19(String a[]) {
        for(int i = 0; i < a.length; i++) {
            String str = a[i];
            if (str.startsWith("A") || str.startsWith("O")) {
                System.out.println(str);
            }
        }
    }



    public static void aufgabe20(String s){
        for(int i =0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }



    public static void aufgabe21(String a[]){
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "-" + a[i].length());
        }
    }



    public static void aufgabe22(){
        String s = "Hello";

        String sub = s.substring(0,2);
        System.out.println(sub);
    }


//    public static void aufgabe23(){
//        String a [] = {"aaa", "bab", "cccc" , "ccz" } ;
//        String b [] = {"abb", "abc", "ccac" , "ckz" , "dea" , "mp" , "upc" } ;
//
//        String []c = new String[a.length + b.length];



    public static String[] aufgabe23(String a[], String b[]) {
        String[] c = new String[a.length + b.length];
        int  m = 0;
        int i = 0, j = 0;
        for (; i < a.length && j < b.length; m++) {
            if(b[j].compareTo(a[i]) < 0)  {//b[j] < a[i]){
                c[m] = b[j];
                j++;
             }else if(b[j].compareTo(a[i]) > 0){
                    c[m] = a[i];
                    i++;
            }
        }
        for (int k = i; k < a.length; k++, m++) {
            c[m] = a[k];
        }
        for (int k = j; k < b.length; k++, m++) {
            c[m] = b[k];
        }

        return c;
    }
}
