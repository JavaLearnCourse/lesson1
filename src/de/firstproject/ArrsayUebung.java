package de.firstproject;

public class ArrsayUebung {

    public static void main(String[] args) {
       boolean a[] = new boolean[5];

        System.out.println(a.length);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }

        String [] ab = new String[6];
        for (int i = 0; i < ab.length ; i++) {
            System.out.println(ab[i]);
        }
// null = Объекта(а строка - это объект) не существует
    }
}
