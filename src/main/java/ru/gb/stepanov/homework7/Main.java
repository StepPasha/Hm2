package ru.gb.stepanov.homework7;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Барсик", 50),
                new Cat("Мурзик", 50),
                new Cat("Кнопа", 25),
                new Cat("Мурка", 5),
                new Cat("Матроскин", 1)};
        Plate plate = new Plate( 80);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int difference = food - n;
        if (difference < 0) return false;
        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }
    void info() {
        System.out.println("plate: " + food);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println("Кот " + name + ": " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}


