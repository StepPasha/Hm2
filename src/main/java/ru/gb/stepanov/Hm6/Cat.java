package ru.gb.stepanov.Hm6;

public class Cat extends Animal {
    public static int counter;
    public Cat(String name, int lengthRunning, int lengthSwim) {
        super(name, lengthRunning, lengthSwim);
        Cat.setRun(182);
        counter++;

    }
    public static int getCounter() {
        return counter;
    }
}



