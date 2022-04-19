package ru.gb.stepanov.NextTasks;

public class FourandFive {
    public static void main(String[] args) {
        method4("Hello", 3);
        methodLeapYear(2016);
    }

    public static void method4(String msg, int count) {
        for (int i = 0; i < count; i++) {

            System.out.println(msg);
        }
    }

    public static boolean methodLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
