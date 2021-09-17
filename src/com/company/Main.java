package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random = new Random();

        int randNum = (random.nextInt(100));
        System.out.println("I've thought of a random number between 0 and 99, try to guess it!");

        for (int g = 3; g > 0; g--) {
            Scanner input = new Scanner(System.in);

            if (g == 1) {
                System.out.println("You have 1 guess left!");
            }
            else {
                System.out.println("You have " + g + " guesses left!");
            }

            System.out.println("Guess a number");
            int guessNum = input.nextInt();

            if (guessNum == randNum) {
                System.out.println("You guessed right! The number was " + randNum + "!");
                System.exit(0);
            }

            else {

                if (guessNum - randNum < 5) {
                    System.out.println("You're wrong but hot!");
                }

                else if (guessNum - randNum < 15) {
                    System.out.println("You're wrong but warm.");
                }

                else {
                    System.out.println("You're wrong and cold...");
                }

            }
        }

        System.out.println("You have no more guesses!");
        System.out.print("Too bad! The number was " + randNum + "!");

        }

    }

