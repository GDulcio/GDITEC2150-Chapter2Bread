package Chapter2_Bread;

public class Bagels extends Bread {
    private String topping;

    //Inherited Bagels Constructor
    public Bagels(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe, String topping) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.topping = topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }
}
