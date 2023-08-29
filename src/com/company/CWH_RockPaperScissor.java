package com.company;
import java.util.Random;
import java.util.Scanner;

public class CWH_RockPaperScissor {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock_Paper_Scissor...");
        System.out.println("Enter your choice : \n 0 - for Rock\n 1 - for Paper\n 2 - for Scissor");
        System.out.print("Your choice : ");
        choice = sc.nextInt();

        if(choice == 0){
            System.out.println("Your choice : Rock");
        }
        else if(choice == 1){
            System.out.println("Your choice : Paper");
        }
        else if(choice == 2){
            System.out.println("Your choice : Scissor");
        }
        else{
            System.out.println("Invalid Choice");
        }

        if(randomNumber == 0){
            System.out.println("Computer's choice : Rock");
        }
        else if(randomNumber == 1){
            System.out.println("Computer's choice : Paper");
        }
        else if(randomNumber == 2){
            System.out.println("Computer's choice : Scissor");
        }

        if(choice == randomNumber){
            System.out.println("Game Draw...");
        }
        else if((choice == 0 && randomNumber == 2) || (choice == 1 && randomNumber == 0) || (choice == 2 && randomNumber == 1)){
            System.out.println("Congratulations! You Win...");
        }
        else{
            System.out.println("Sorry, You lose...");
        }

    }
}
