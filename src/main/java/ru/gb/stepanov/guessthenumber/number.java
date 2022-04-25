package ru.gb.stepanov.guessthenumber;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your task is to guess the number");
        int range = 10;
        int number = (int)(Math.random()* range);
        while(true){
            System.out.println("Guess the number from 0 to " + range);
            int inputNumber = scanner.nextInt();
            if(inputNumber == number){
                System.out.println("You guessed right");
                break;
            }
            else if (inputNumber > number){
                System.out.println("The hidden number is less");
            } else {
                System.out.println("The hidden number is greater");
            }
        }
        scanner.close();
    }
}

