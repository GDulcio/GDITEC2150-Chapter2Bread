package Chapter2_Bread;

public class StrawberryShortcake extends Bread {
    private int strawberries;

    //Inherited Strawberry Shortcake Constructor
    public StrawberryShortcake(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe, int strawberries) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.strawberries = strawberries;
    }

    public void setStrawberries(int strawberries) {
        this.strawberries = strawberries;
    }

    public int getStrawberries() {
        return strawberries;
    }
}
