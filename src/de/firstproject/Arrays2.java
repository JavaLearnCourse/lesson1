package de.firstproject;

public class Arrays2 {

    public static void main(String[] args) {
        int a[][] = new int[3][2];
        a[0][1] = 45;
        a[2][1] = -45;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
