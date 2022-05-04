package ru.gb.stepanov.Hm6;

public class Generalinfo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
            animals[0] = new Cat("Murzik", 200, 0);
            animals[1] = new Dog("Bobik", 500, 10);
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(100);
            animals[i].swim(6);
        }
        System.out.println("Cats: " + (Cat.getCounter()));
        System.out.println("Dogs: " + (Dog.getCounter()));
        System.out.println("Animals: " + Animal.getCounter());
    }
}