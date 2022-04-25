package ru.gb.stepanov.Hm3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        methodTask2();
        methodTask3();
        methodTask4();
        methodTask5(10, 5);
        methodTask6();


        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;

        }
        System.out.println(Arrays.toString(a));
    }

    public static void methodTask2() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println(a[i] + "");

        }
        System.out.println(" ");
    }

    public static void methodTask3() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
                System.out.println(a[i] + "");

            }
        }
        System.out.println(" ");
    }

    public static void methodTask4() {
        int[][] a = new int[4][4];
        a[0][0] = 1;
        a[1][1] = 1;
        a[2][2] = 1;
        a[3][3] = 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void methodTask5(int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
            System.out.print("[" + i + "]" + a[i] + " ");
        }
        System.out.println("  ");
    }


    public static void methodTask6() {
        int[] a = {1, 3, 5, 6, 7, 2, 4, 8, 9, 10};
        int min = 1;
        int max = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if(a[i] > max);
            max = a[i];

        }
        System.out.println("max = "+max+" min = "+min);
        System.out.println(" ");
        }
    }


