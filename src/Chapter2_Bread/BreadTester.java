package Chapter2_Bread;

public class BreadTester {
    public static void main(String[] args) {
        Sourdough sourdough = new Sourdough(5, 1.5, 2.5, 1, 0, 1, 1, "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n" + "3. Bulk Rise\n" + "4. Stretch and fold the dough\n" + "5. Cut and shape the dough\n" +
                "6. Second rise\n" + "7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "8. Spray the loaf with luke warm water.\n" + "9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "10. Remove the bread from the oven.\n" + "11. Let the bread cool until good to eat.", 3.0);
        System.out.println(sourdough.getIngredients());
        System.out.println("A recipe of " + sourdough.getBreadName() + ":\n" + sourdough.getRecipe());
        sourdough.bake();

    }
}
