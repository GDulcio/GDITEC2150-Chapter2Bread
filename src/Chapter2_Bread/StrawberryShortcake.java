package Chapter2_Bread;

public class StrawberryShortcake extends Bread {
    private int strawberries;

    public StrawberryShortcake(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe, int strawberries) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Strawberry Short Cake", "1. Preheat oven to 425°F (220°C).\n" + "2. Mix flour, sugar, baking powder, and salt in a large bowl.\n" + "3. Cut in butter until mixture resembles coarse crumbs.\n" + "4. Stir in milk until dough forms.\n" + "5. Drop dough by spoonfuls onto baking sheet.\n" + "6. Bake for 10-12 minutes or until golden brown.\n" + "7. Cool completely before assembling cake with whipped cream and strawberries.");
        this.strawberries = strawberries;
    }

    public int getStrawberries() {
        return strawberries;
    }

    public void setStrawberries(int strawberries) {
        this.strawberries = strawberries;
    }
}
