/**Class: FarmAnimal.java
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class – stores the information for farm animals in an array or array list and then displays the sound the animals make.
 */
package Chapter3_Animal;
import java.util.ArrayList;

public abstract class FarmAnimal {
    // Attributes
    private String name;
    private String gender;
    private double weight;
    private int age;

    //Constructor
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nGender: " + gender + "\nWeight: " + weight + "lbs \nAge: " + age;
    }

    // Abstract method feedLoadingSchedule
    public abstract String feedLoadingSchedule();

    // Subclasses: Chicken, Cow, Duck
    class Chicken extends FarmAnimal {

        private String sound;

        public Chicken(String name, String gender, double weight, int age, String sound) {
            super(name, gender, weight, age);
            this.sound = sound;
        }

        //Getter and setter for sound
        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        //toString method
        @Override
        public String toString() {
            return "Chicken - " + super.toString() + ", Sound: " + sound;
        }

        //Override feedLoadingSchedule method
        @Override
        public String feedLoadingSchedule() {
            return "8am-4pm";
        }
    }

    class Cow extends FarmAnimal {

        private String sound;

        public Cow(String name, String gender, double weight, int age, String sound) {
            super(name, gender, weight, age);
            this.sound = sound;
        }

        //Getter and setter for sound
        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        //toString method
        @Override
        public String toString() {
            return "Cow - " + super.toString() + ", Sound: " + sound;
        }

        //Override feedLoadingSchedule method
        @Override
        public String feedLoadingSchedule() {
            return "6am-4pm";
        }
    }

    class Duck extends FarmAnimal {

        private String sound;


        public Duck(String name, String gender, double weight, int age, String sound) {
            super(name, gender, weight, age);
            this.sound = sound;
        }

        //Getter and setter for sound
        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        //toString method
        @Override
        public String toString() {
            return "Duck - " + super.toString() + ", Sound: " + sound;
        }

        //Override feedLoadingSchedule method
        @Override
        public String feedLoadingSchedule() {
            return "8am-12pm-6pm";
        }
    }

    public class MyFarm {
        public void main(String[] args) {
            // Create an array list to store farm animals
            ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

            // Add six different farm animals
            farmAnimals.add(new Chicken("Jill", "Female", 2.5, 2, "Cluck"));
            farmAnimals.add(new Chicken("Jack", "Male", 3.0, 1, "Cluck"));
            farmAnimals.add(new Cow("Bessie", "Female", 450.0, 5, "Moo"));
            farmAnimals.add(new Cow("John", "Male", 600.0, 3, "Moo"));
            farmAnimals.add(new Duck("Maria", "Female", 1.8, 1, "Quack"));
            farmAnimals.add(new Duck("Donald", "Male", 2.0, 2, "Quack"));

            // Print out information about each farm animal
            for (FarmAnimal animal : farmAnimals) {
                System.out.println(animal.toString());
                System.out.println("Feeding Schedule: " + animal.feedLoadingSchedule());
                System.out.println();
            }
        }
    }

}
