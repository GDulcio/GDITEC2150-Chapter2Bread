package Chapter2_Bread;
/**Class: Bread
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: February 20, 2024
 *
 * This class – displays recipes of different types of breads
 */
public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    private String state;
    private String recipe;

    // Default Constructor
    public Bread() {
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.breadName = "";
        this.state = "";
        this.recipe = "";
    }

    // Constructor with all parameters
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = "Not baked";
        this.recipe = recipe;
    }

    // Getters and setters
    public void setFlour(double flour) {
        this.flour = flour;
    }
    public double getFlour() {
        return flour;
    }

    public void setWater(double water) {
        this.water = water;
    }
    public double getWater() {
        return water;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }
    public double getSalt() {
        return salt;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    public double getSugar() {
        return sugar;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }
    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }
    public double getYeast() {
        return yeast;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }
    public String getBreadName() {
        return breadName;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
    public String getRecipe() {
        return recipe;
    }

    //Method to print out the bread ingredients
    @Override
    public String toString() {
        return "Bread ingredients: " + "\nflour= " + flour + "\nwater= " + water + "\nsalt= " + salt + "\nsugar= " + sugar +
                "\nbaking powder= " + bakingPowder + "\nyeast= " + yeast + "\nbread name= " + breadName + "\nstate= " + state + "\nrecipe= " + recipe;
    }

    //Method to bake the bread
    public void bake() {
        if (state.equals("Not Baked")) {
            state = "Baked";
            System.out.println("The " + breadName + " is baked now.");
        } else {
            System.out.println(breadName + " is already baked.");
        }
    }

    // Method to get ingredients
    public String getIngredients() {
        return "Ingredients of " + breadName + " are:\n" + flour + " cups of flour\n" + water + " cups of water\n" +
                salt + " tsps of salt\n" + sugar + " cups of sugar\n" + bakingPowder + " tsps of baking powder\n" + yeast + " tbps of yeast";
    }
}
