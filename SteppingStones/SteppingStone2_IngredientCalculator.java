package SteppingStones;

import java.util.Scanner;

/**
 * This class collects ingredient information using the variable names and structure
 * exactly as described in the Stepping Stone 2 sample instructions.
 */
public class SteppingStone2_IngredientCalculator {

    public static void main(String[] args) {

        // Assign the following variables with the appropriate data type and value
        String nameOfIngredient = "";
        double numberCups = 0.0;
        int numberCaloriesPerCup = 0;
        double totalCalories = 0.0;
        String unitMeasurement = "";

        Scanner scnr = new Scanner(System.in);

        // Prompt for ingredient name
        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.nextLine();

        // Prompt for number of cups
        System.out.println("Please enter the number of cups of " 
            + nameOfIngredient + " we'll need: ");
        if (scnr.hasNextDouble()) {
            numberCups = scnr.nextDouble();
            scnr.nextLine(); // Clear the newline
        } else {
            System.out.println("Invalid input. Please restart and enter a numeric value.");
            scnr.close();
            return;
        }

        // Prompt for unit of measurement
        System.out.println("Please enter the unit of measurement (e.g., cups, oz, tablespoons): ");
        unitMeasurement = scnr.nextLine();

        // Prompt for calories per unit
        System.out.println("Please enter the number of calories per " + unitMeasurement + ": ");
        if (scnr.hasNextInt()) {
            numberCaloriesPerCup = scnr.nextInt();
        } else {
            System.out.println("Invalid input. Please restart and enter a whole number.");
            scnr.close();
            return;
        }

        // Calculate totalCalories using numberCups * numberCaloriesPerCup
        totalCalories = numberCups * numberCaloriesPerCup;

        // Output result
        System.out.println(nameOfIngredient + " uses " + numberCups 
            + " " + unitMeasurement + " and has " + totalCalories + " total calories.");

        scnr.close();
    }
}
