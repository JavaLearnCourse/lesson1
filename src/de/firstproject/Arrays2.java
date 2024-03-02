package de.firstproject;

public class Arrays2 {

    public static void main(String[] args) {
        int a[] = {2,3,8,9,10,72,76,101};
        int b[] = {0,1,4};
        int [] c = aufgabe22(a, b);
        for(int k = 0; k < c.length; k++){
            System.out.print(c[k] + " ");
        }

        double x = Math.pow(2,5);
        System.out.println(x);
    }

    public static int[] aufgabe22(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int  m = 0;
        int j = 0;
        for (; i < a.length && j < b.length; m++) {
            if (b[j] < a[i]) {
                c[m] = b[j];
                j++;
            } else if (b[j] > a[i]) {
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
