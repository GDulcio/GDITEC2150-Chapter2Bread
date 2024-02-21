package Chapter2_Bread;

public class Sourdough extends Bread{
    private double sourdoughStarter;

    //Inherited Sourdough Constructor
    public Sourdough(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, String recipe, double sourdoughStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, recipe);
        this.sourdoughStarter = sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }

    public double getSourdoughStarter() {
        return sourdoughStarter;
    }
}

