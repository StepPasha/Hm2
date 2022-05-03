package ru.gb.stepanov.Hm6;

public class Dog extends Animal {
    public static int counter;
    public Dog(String name, int lengthRunning, int lengthSwim) {
        super(name, lengthRunning, lengthSwim);
        Dog.setSwim(6);
        Dog.setRun1(423);
        counter++;


    }
    public static int getCounter() {
        return counter;
    }
}






