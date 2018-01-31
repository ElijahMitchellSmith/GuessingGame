package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int numberOfGuesses = (0);

        final int MAX_GUESS_COUNT = 4;


            int generatedNumber = (int) Math.ceil(Math.random() * 100);

            do {
                try{

                System.out.println("Enter your guess:");
                int userGuess = input.nextInt();

                if (userGuess > generatedNumber) {
                    System.out.println("your number is too high!");
                    numberOfGuesses++;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your number is too low");
                    numberOfGuesses++;
                } else if (userGuess == generatedNumber) {
                    System.out.println("Correct!");
                } else if (numberOfGuesses == MAX_GUESS_COUNT) {
                    System.out.println("You're out of guesses, the correct number was:" + generatedNumber);
                } else if (userGuess == generatedNumber) {
                    System.out.println("You guessed the correct number!");
                }
                } catch (Exception e) {
                        System.out.println("What kind of answer is that?");
                        numberOfGuesses = (0);
                        break;
                }
            } while (numberOfGuesses <= 4);
            System.out.println("The corect number was " + generatedNumber);
            System.out.println("Do you want to play again?");


        }


    }





