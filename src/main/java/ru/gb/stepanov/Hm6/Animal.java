package ru.gb.stepanov.Hm6;

public class Animal {
    protected static String name;
    protected static int lengthRunning;
    private static int lengthSwim;
    private int run;
    private int swim;
    private int run1;
    private static int counter;

    public Animal(String name, int lengthRunning, int lengthSwim) {
        this.name = name;
        this.lengthSwim = lengthSwim;
        this.lengthRunning = lengthRunning;



    }
    public Animal() {
        counter++;
    }

    public String getName() {
        return name;
    }


    public void setLengthRunning(int lengthRunning) {
        this.lengthRunning = lengthRunning;
    }

    public void setLengthSwim(int lengthSwim) {
        this.lengthSwim = lengthSwim;
    }

    public static void setRun(int run) {
        if (run <= lengthRunning) {
            System.out.println(name + " running " + run + "m");
        } else {
            System.out.println("Cat don't run this quantity!!!");
        }

    }

    public static void setSwim(int swim) {
        if (swim <= lengthSwim) {
            System.out.println(name + " swimming " + swim + "m");
        } else {
            System.out.println("Dog don't swim this quantity!!!");
        }
    }

    public static void setRun1(int run1) {
        if (run1 <= lengthRunning) {
            System.out.println(name + " running " + run1 + "m");
        } else {
            System.out.println("Bobik don't run this quantity!!!");
        }
    }

    public static int getCounter() {
        return counter;
    }
}










