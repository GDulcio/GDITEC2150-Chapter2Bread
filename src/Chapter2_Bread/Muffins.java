package Chapter2_Bread;

public class Muffins extends Bread {
    private String muffinType;

    //Inherited Muffins Constructor
    public Muffins(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String muffinType, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.muffinType = muffinType;
    }

    //Getters ans setters
    public void setMuffinType(String muffinType) {
        this.muffinType = muffinType;
    }

    public String getMuffinType() {
        return muffinType;
    }
}

