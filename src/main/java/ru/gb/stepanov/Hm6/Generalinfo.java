package ru.gb.stepanov.Hm6;

public class Generalinfo {
    public static void main(String[] args) {
        final Cat cat = new Cat("Murzik", 200, 0);
        final Dog dog = new Dog("Bobik", 500, 10);
        System.out.println("Cats: " + (Cat.getCounter()));
        System.out.println("Dogs: " + (Dog.getCounter()));
        System.out.println("Animals: " + Animal.getCounter());

    }
}