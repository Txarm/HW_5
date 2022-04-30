package ru.test;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        float[] b = {1.57f, 7.654f, 9.986f};
        int[] c = {5, 10, 15};
        //Task 2
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < b.length; i++) {
            if (i < b.length - 1) {
                System.out.print(b[i] + ",");
            } else {
                System.out.print(b[i]);}
            }
        System.out.println("\n");
        for (int i = 0; i < c.length; i++) {
            if (i < c.length - 1) {
                System.out.print(c[i] + ",");
            } else {
                System.out.print(c[i]);
            }
        }
        System.out.println("\n");
        // Task3
        for (int i = a.length - 1; i > -1; i--) {
            if (i != 0) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
            }
        System.out.println("\n");
        for (int i = b.length - 1; i > -1; i--) {
            if (i != 0) {
                System.out.print(b[i] + ",");
            } else {
                System.out.print(b[i]);
            }
        }
                System.out.println("\n");
        for (int i = c.length - 1; i > -1; i--) {
            if (i != 0) {
                System.out.print(c[i] + ",");
            } else {
                System.out.print(c[i]);
            }
            }
        System.out.println("\n");
        // Task 4
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] = a[i] + 1;
            }
            System.out.print(a[i] + " ");
        }
    }
}