package ru.gb.stepanov.Hm6;

public class Dog extends Animal {
    public static int counter;
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        counter++;
    }
    public static int getCounter() {
        return counter;
    }
}






