package Chapter2_Bread;

public class Pastries extends Bread {
    private String pastryType;

    //Inherited Pastries Constructor
    public Pastries(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String pastryType, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.pastryType = pastryType;
    }

    public void setPastryType(String pastryType) {
        this.pastryType = pastryType;
    }

    public String getPastryType() {
        return pastryType;
    }
}

