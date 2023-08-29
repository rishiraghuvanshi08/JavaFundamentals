package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_FileHandling {
    public static void main(String[] args) {


//        Code to create a new file
//        File file = new File("cwh111file.txt");
        /*
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        */

//        Code to write a new file
        /*
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from our java course\nOkay now bye");
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
         */

        // Reading a file
        /*
        File file = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

         */

        // Deleting a file
        File file = new File("cwh111file.txt");
        if(file.delete()){
            System.out.println("I have deleted : " + file.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
