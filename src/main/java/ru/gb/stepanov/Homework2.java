package ru.gb.stepanov;

public class Homework2 {
    public static void main(String[] args) {
        boolean result;
        result = method1020(4, 10);
        methodTaskTwo(10);
        boolean method;
        method = methodPositiveOrNegative(90);


    }

    public static boolean method1020(int a, int b) { // номер 1
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;

        }
    }

    public static void methodTaskTwo(int a) { // номер 2
        if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");

        }
    }

    public static boolean methodPositiveOrNegative(int a) { // номер 3
        if (a >= 0) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }
}




