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
        this.state = "Not Baked";
        this.recipe = recipe;
    }
}
