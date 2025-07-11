package SteppingStones;

import java.util.Scanner;

public class SteppingStone3_Branches {

    public static void main(String[] args) {
        final int MAX_CUPS = 100; 
        int numberCups = -1;      

        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the number of cups (between 1 and 100): ");

        if (scnr.hasNextInt()) {
            numberCups = scnr.nextInt();

            // NESTED BRANCH
            if (numberCups <= MAX_CUPS && numberCups >= 1) {
                System.out.println(numberCups + " is a valid number of cups!");
            } else {
                System.out.println(numberCups + " is not a valid number of cups!");
                System.out.println("Please enter another number of cups between 1 and 100: ");
                if (scnr.hasNextInt()) {
                    numberCups = scnr.nextInt();

                    if (numberCups <= MAX_CUPS && numberCups >= 1) {
                        System.out.println(numberCups + " is a valid number of cups!");
                    } else if (numberCups < 1) {
                        System.out.println(numberCups + " is less than 1. Sorry you are out of attempts.");
                    } else {
                        System.out.println(numberCups + " is greater than 100. Sorry you are out of attempts.");
                    }
                } else {
                    System.out.println("That is not a number. Sorry you are out of attempts.");
                }
            }

        } else {
            System.out.println("Error: That is not a number. Try again.");
        }

        scnr.close();
    }
}
