package Chapter2_Bread;

public class Muffins extends Bread {
    private String muffinType;

    //Inherited Muffins Constructor
    public Muffins(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String muffinType, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Muffins", "1. Preheat oven to 375°F (190°C).\n" + "2. Mix flour, sugar, baking powder, and salt in a large bowl.\n" + "3. In another bowl, beat egg, then stir in milk and oil.\n" + "4. Add liquid mixture to dry mixture, stirring just until moistened.\n" + "5. Fill greased muffin cups two-thirds full.\n" + "6. Bake for 18-20 minutes or until a toothpick inserted in the center comes out clean.");
        this.muffinType = muffinType;
    }

    //Getters ans setters
    public String getMuffinType() {
        return muffinType;
    }

    public void setMuffinType(String muffinType) {
        this.muffinType = muffinType;
    }
}

