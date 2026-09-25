package com.jmpjva.week3.dicegame;

import java.security.SecureRandom;

/**
 * What this code does:
 * This class creates a dice game where the user rolls four dice and the sum of the four dice decides the result.
 * These number 7,11,15,21 as sum make the user win immediately.
 * These number 10,12,19, 20,22,23 ,24 as sum make the user lose immediately.
 * For any other total, that number becomes the goal number, and the user rolls the four dice again to try to match it.
 * Program simply generates random values from 1 to 6 for four dice, calculates their total, checks the total against the winning and losing numbers, and performs a second roll when required.
 */

public class DiceGame {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int die3 = random.nextInt(6) + 1;
        int die4 = random.nextInt(6) + 1;

        int sum = die1 + die2 + die3 + die4;

        System.out.println("First Roll:");
        System.out.println("Dice 1: " + die1);
        System.out.println("Dice 2: " + die2);
        System.out.println("Dice 3: " + die3);
        System.out.println("Dice 4: " + die4);
        System.out.println("Total: " + sum);

        if (sum == 7 || sum == 11 || sum == 15 || sum == 21) {

            System.out.println("You win!");

        }
        
        else if (sum == 10 || sum == 12 || sum == 13 ||
                 sum == 19 || sum == 20 || sum == 22 ||
                 sum == 23 || sum == 24) {

            System.out.println("You lose!");

        }
        
        else {

            int goal = sum;

            System.out.println("Your goal number is: " + goal);
            System.out.println("Roll the four dice again.");

            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            die3 = random.nextInt(6) + 1;
            die4 = random.nextInt(6) + 1;

            sum = die1 + die2 + die3 + die4;

            System.out.println();
            System.out.println("Second Roll:");
            System.out.println("Dice 1: " + die1);
            System.out.println("Dice 2: " + die2);
            System.out.println("Dice 3: " + die3);
            System.out.println("Dice 4: " + die4);
            System.out.println("Total: " + sum);

            if (sum == goal) {
                System.out.println("You win!");
            }
            
            else {
                System.out.println("You lose!");
            }
        }
    }
}

