package ru.gb.stepanov.Hm6;

public class Cat extends Animal {
    public static int counter;
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}



