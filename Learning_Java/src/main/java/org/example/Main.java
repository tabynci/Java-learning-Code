package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Creates a reader instance which takes
        // inf=put form standard input -keyboard
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");

        //nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println()print the following line to the output screen
        System.out.println("you entered :  " + number) ;


        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");

        String names= name.nextLine();
        System.outprintln(names);

            }
}