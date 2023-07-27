package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".

        Scanner input = new Scanner(System.in);
        /*System.out.println("Asks for a number - amount of strangers to meet");*/
        int amountOfStrangersToMeet = input.nextInt();

        if (amountOfStrangersToMeet < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (amountOfStrangersToMeet == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            input.nextLine();
            for (int i = 0; i < amountOfStrangersToMeet; i++) {
                String strangersNames = input.nextLine();
                System.out.println("Hello, " + strangersNames);
            }
        }
    }
}

