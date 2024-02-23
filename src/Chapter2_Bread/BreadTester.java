package Chapter2_Bread;

public class BreadTester {
    public static void main(String[] args) {
        Sourdough sourdough = new Sourdough(5, 1.5, 2.5, 1, 0, 1, "Sourdough", "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n 2. Make the dough\n 3. Bulk Rise\n 4. Stretch and fold the dough\n 5. Cut and shape the dough\n 6. Second rise\n 7. Preheat the oven to 450°F towards the tail end of the second rise.\n 8. Spray the loaf with luke warm water.\n 9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n 10. Remove the bread from the oven.\n 11. Let the bread cool until good to eat.", 3.0);
        System.out.println(sourdough.getIngredients());
        System.out.println("A recipe of" + sourdough.getBreadName() + ":" + sourdough.getRecipe());
        sourdough.bake();

        String topping = "";
        Bagels bagels = new Bagels(4, 2, 2, 0.5, 1, 1, "Bagels", "1. Mix flour, water, yeast, and sugar.\n" +
                "2. Shape the dough into rings.\n" +
                "3. Boil in water with baking soda.\n" +
                "4. Add " + topping + " as topping.\n" +
                "5. Bake until golden brown.", "cream cheese");
        System.out.println(bagels.getIngredients());
        System.out.println("A recipe of" + bagels.getBreadName() + ":" + bagels.getRecipe());
        bagels.bake();

        Muffins muffins = new Muffins(4, 1, 1, 2, 0, 1, "Banana Nut", "Muffins", "1. Preheat oven to 375°F (190°C).\n" + "2. Mix flour, sugar, baking powder, and salt in a large bowl.\n" + "3. In another bowl, beat egg, then stir in milk and oil.\n" + "4. Add liquid mixture to dry mixture, stirring just until moistened.\n" + "5. Fill greased muffin cups two-thirds full.\n" + "6. Bake for 18-20 minutes or until a toothpick inserted in the center comes out clean.");
        System.out.println(muffins.getIngredients());
        System.out.println("A recipe of" + muffins.getBreadName() + ":" + muffins.getRecipe());
        muffins.bake();

        Pastries pastries = new Pastries(6, 3, 2, 6, 2, 2, "Apple Strudel", "Pastries", "1. Preheat oven to 375°F (190°C).\n" + "2. Roll out pastry dough.\n" + "3. Cut dough into desired shapes.\n" + "4. Place on baking sheet.\n" + "5. Bake for 15-20 minutes or until golden brown.");
        System.out.println(pastries.getIngredients());
        System.out.println("A recipe of" + pastries.getBreadName() + ":" + pastries.getRecipe());
        pastries.bake();

        StrawberryShortcake strawberryShortcake = new StrawberryShortcake(3, 2, 0.5, 2, 1, 1, "Strawberry Shortcake", "1. Preheat oven to 425°F (220°C).\n" + "2. Mix flour, sugar, baking powder, and salt in a large bowl.\n" + "3. Cut in butter until mixture resembles coarse crumbs.\n" + "4. Stir in milk until dough forms.\n" + "5. Drop dough by spoonfuls onto baking sheet.\n" + "6. Bake for 10-12 minutes or until golden brown.\n" + "7. Cool completely before assembling cake with whipped cream and strawberries.", 3);
        System.out.println(strawberryShortcake.getIngredients());
        System.out.println("A recipe of" + strawberryShortcake.getBreadName() + ":" + strawberryShortcake.getRecipe());
        strawberryShortcake.bake();
    }
}
