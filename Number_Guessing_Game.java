package Task_2;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {

        Random Random_number = new Random();
        int random = Random_number.nextInt(100);
        int attempts = 0;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("You will have 15 chances to guess a number between 1 and 100");
            System.out.println("Best wishes!!");

            System.out.println("Guess a Number :");
            int guess;

            while (attempts < 15) {
                guess = in.nextInt();
                attempts++;

                if (guess < random) {

                    System.out.println("Your Guess is Lower than the Right Guess! Attempts left: " + (15 - attempts));
                } 
                
                else if (guess > random) {

                    System.out.println("Your Guess Is Higher Than The Right Guess! Attempts left: " + (15 - attempts));

                } 
                
                else {
                
                    System.out.println("You've Won the Match!");
                    System.out.println("The number generated at random was: " + random);
                    System.out.println("You used " + attempts + " guesses to get the correct number.");
                    System.out.println("Your total score is " + (((15-attempts)*20)/3) + " out of 100");
                    System.exit(0);
                }
            }
            
            System.out.println("You Lost The Game!\nThe random number generated was :" + random);
        } finally {
            
            in.close();
        }
    }
}