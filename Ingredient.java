/**
 * Ingredient models the properties of a recipe ingredient,
 * including name, amount, unit of measure, and calorie data.
 */
public class Ingredient {
    private String name;
    private double amount;
    private String unit;
    private int caloriesPerUnit;

    // Constructor
    public Ingredient(String name, double amount, String unit, int caloriesPerUnit) {
        this.name            = name;
        this.amount          = amount;
        this.unit            = unit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    // Calculates total calories based on amount and calories per unit
    public double getTotalCalories() {
        return amount * caloriesPerUnit;
    }

    // Returns a formatted string describing the ingredient
    public String getSummary() {
        return "Ingredient: " + name + "\n" +
            "Amount: " + amount + " " + unit + "\n" +
            "Calories per " + unit + ": " + caloriesPerUnit + "\n" +
            "Total Calories: " + getTotalCalories();
    }
}
