package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int numberOfGuesses = 0;

        final int MAX_GUESS_COUNT = 4;

        System.out.println("Enter your guess:");
        int userGuess = input.nextInt();

        int generatedNumber = (int) Math.ceil(Math.random() * 100);

        do {
            if (userGuess > generatedNumber) {
                System.out.println("your number is too high!");
                numberOfGuesses++;
            } else if (userGuess < generatedNumber) {
                System.out.println("Your number is too low");
                numberOfGuesses++;
            } else if (userGuess == generatedNumber) {
                System.out.println("Correct!");
            } else if (numberOfGuesses == MAX_GUESS_COUNT) {
                System.out.println("You're out of guesses!");
            }
        } while (numberOfGuesses <= 4);
    }
}


