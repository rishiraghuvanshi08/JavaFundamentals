package com.company;

import java.util.Scanner;

class Library{
    private String [] issueBooks = new String[100];
    private String [] returnBooks = new String[100];
    String [] availableBooks = {"A", "B", "C", "D", "E", "F"};

    int number;
    Scanner s = new Scanner(System.in);

    public String[] getIssueBooks() {
        return issueBooks;
    }

    public void setIssueBooks(){
        System.out.print("How many books you want to issue : ");
        number = s.nextInt();
        for (int i = 0; i < number; i++){
            System.out.format("Book %d name : ", i+1);
            //s.nextLine();
            issueBooks[i] = s.nextLine();
        }
        System.out.println("Books issued successfully...");
    }

    public String[] getReturnBooks() {
        return returnBooks;
    }

    public void setReturnBooks(){
        System.out.print("How many books you want to return : ");
        number = s.nextInt();
        for (int i = 0; i < number; i++){
            System.out.format("Book %d name : ", i);
            returnBooks[i] = s.nextLine();
        }
        System.out.println("Books returned successfully...");
    }

    public String[] getAvailableBooks() {
        return availableBooks;
    }

    public int userChoice(){
        System.out.print("""
                Press 1 - to issue books
                Press 2 - to return book
                Press 3 - to check available books
                Your choice :\s""");
        return s.nextInt();
    }
}

public class CWH_Library_Exercise {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Library l = new Library();

        System.out.println("__________WELCOME TO THE LIBRARY__________");

        int userChoice = l.userChoice();

        if (userChoice == 1){
            l.setIssueBooks();
            System.out.println("Books issued by you : ");
            String [] finalIssues = l.getIssueBooks();
            for (String element: finalIssues) {
                if(element == null){
                    break;
                }
                System.out.println(element);
            }
        }
        else if (userChoice == 2){
            l.setIssueBooks();
            System.out.println("Books returned by you : ");
            String [] finalReturns = l.getReturnBooks();
            for (String element: finalReturns) {
                System.out.println(element);
            }
        }
        if (userChoice == 3){

            String [] booksAvailable = l.availableBooks;
            for (String element: booksAvailable) {
                System.out.println(element);
            }
            l.setIssueBooks();
            System.out.println("Books issued by you : ");
            String [] finalIssues = l.getIssueBooks();
            for (String element: finalIssues) {
                System.out.println(element);
            }
        }
    }
}
