package SteppingStones;

/**
 * Ingredient models the properties of a recipe ingredient,
 * including name, amount, unit of measure, and calorie data.
 */
public class Ingredient {
    private String name;
    private double amount;
    private String unit;
    private double caloriesPerUnit;

    // Constructor
    public Ingredient(String name, double amount, String unit, double caloriesPerUnit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
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

    // Getters (optional, for future use)
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public double getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    // Setters (optional, for future editing features)
    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setCaloriesPerUnit(double caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }
}
