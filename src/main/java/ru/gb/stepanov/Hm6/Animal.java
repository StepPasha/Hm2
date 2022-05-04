package ru.gb.stepanov.Hm6;

public abstract class Animal {
    protected String name;
    protected int run;
    protected int swim;
    private static int counter;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


    public Animal() {
        counter++;
    }
    protected void run(int distance) {
        if (run > distance) {
            System.out.println(this.name + " running " + distance + "m");
        } else {
            System.out.println(this.name + " can't running this distance");
        }
    }
    protected void swim(int distance) {
        if (swim > distance) {
            System.out.println(this.name + " swimming " + distance + "m");
        } else {
            System.out.println(this.name + " can't swimming this distance");
        }
    }

        public static int getCounter () {
            return counter;
        }
    }












