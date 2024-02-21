package Chapter2_Bread;

public class Pastries extends Bread {
    private String pastryType;

    //Inherited Pastries Constructor
    public Pastries(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String pastryType, String breadName, String recipe) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Pastries", "1. Preheat oven to 375°F (190°C).\n" + "2. Roll out pastry dough.\n" + "3. Cut dough into desired shapes.\n" + "4. Place on baking sheet.\n" + "5. Bake for 15-20 minutes or until golden brown.");
        this.pastryType = pastryType;
    }

    public String getPastryType() {
        return pastryType;
    }

    public void setPastryType(String pastryType) {
        this.pastryType = pastryType;
    }
}

