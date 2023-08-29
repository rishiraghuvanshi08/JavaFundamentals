package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    private int randomNumber;
    private int userInput;
    private int noOfGuesses = 1;

    public Game(){
        Random rand = new Random();
        randomNumber = rand.nextInt(101);
    }
    public void isCorrectNumber(){
        for(int i = 0; true; i++) {
            System.out.print("Enter a number (between 0 and 100) : ");

            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            if(userInput > 100 || userInput < 0){
                System.out.println("Please enter a valid number...");
                continue;
            }

            if (userInput > randomNumber) {
                System.out.println("Entered Number is Greater.\n" +
                                    "Please enter a Smaller Number...");
            }
            else if (userInput < randomNumber) {
                System.out.println("Entered Number is Smaller.\n" +
                                    "Please enter a Greater Number...");
            }
            else if (userInput == randomNumber) {
                System.out.println("\nCongratulations! You guessed the correct number.\n");
                break;
            }
            noOfGuesses++;
        }
    }
    public int getter(){
        return noOfGuesses;
    }
}
public class CWH_Guess_the_number {
    public static void main(String[] args) {
        Game guessTheNumber = new Game();

        System.out.println("______________GUESS THE NUMBER______________\n" +
                            "Welcome to the GAME...");

        guessTheNumber.isCorrectNumber();
        System.out.printf("You guessed in %d times.", guessTheNumber.getter());
    }
}
