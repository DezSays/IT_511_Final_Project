import java.util.Scanner;

/**
 * This class serves as the application driver for collecting and displaying
 * nutritional information about a single ingredient. It demonstrates use of 
 * object-oriented principles, data types, and basic input validation.
 */
public class SteppingStone2_IngredientCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the ingredient name
        System.out.print("Enter the name of the ingredient: ");
        String name = input.nextLine();

        // Prompt for the amount used; must be a decimal number
        double amount = 0.0;
        System.out.print("Enter the amount used (e.g., 0.5): ");
        if (input.hasNextDouble()) {
            amount = input.nextDouble();
        } else {
            System.out.println("Invalid input. Please restart and enter a decimal value.");
            input.close();
            return;
        }

        input.nextLine(); // Skip the remaining newline after reading a number to avoid input issues

        // Prompt for unit of measurement (e.g., cups, oz)
        System.out.print("Enter the unit of measurement (e.g., cups, oz, tablespoons): ");
        String unit = input.nextLine();

        // Prompt for calories per unit; must be a whole number
        int caloriesPerUnit = 0;
        System.out.print("Enter the number of calories per " + unit + " (whole number): ");
        if (input.hasNextInt()) {
            caloriesPerUnit = input.nextInt();
        } else {
            System.out.println("Invalid input. Please restart and enter a whole number.");
            input.close();
            return;
        }

        input.close(); // Close the scanner to avoid memory leak

        // Create an Ingredient object with the data collected
        Ingredient ingredient = new Ingredient(name, amount, unit, caloriesPerUnit);

        // Output the ingredient summary
        System.out.println("\nIngredient Summary:");
        System.out.println(ingredient.getSummary());
    }
}
