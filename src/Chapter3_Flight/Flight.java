/**Class: Flight.interface
 * @author Gardy Dulcio
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 18, 2024
 *
 * This class – stores the information for farm animals in an array or array list and then displays the sound the animals make.
 */
package Chapter3_Flight;

//Interface Flight
interface Flight {
    void fly();
}

class Airplane implements Movement {

    private String model;
    private int yearBuilt;

    //Constructor
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    //Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    //Implementing the fly method for Airplane
    @Override
    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    //Implementing the walk method for Airplane
    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    //Implementing the jump method for Airplane
    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    //toString method for Airplane
    @Override
    public String toString() {
        return "Airplane model=" + model + ", year=" + yearBuilt;
    }
}


class Bird implements Movement {

    private String type;

    //Constructor
    public Bird(String type) {
        this.type = type;
    }

    //Getter and Setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Implementing the fly method for Bird
    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps my wings to fly.");
    }

    //Implementing the walk method for Bird
    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    //Implementing the jump method for Bird
    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    //toString method for Bird
    @Override
    public String toString() {
        return "Bird type =" + type;
    }
}

//Interface Movement
interface Movement extends Flight {
    void walk();
    void jump();
}

class ThingsThatMove {
    public static void main(String[] args) {
        // Create an array to store objects that can move
        Movement[] movingObjects = new Movement[3];

        // Create objects: Airplane, Bird (Eagle), Bird (Hummingbird)
        movingObjects[0] = new Airplane("Boeing 747", 2016);
        movingObjects[1] = new Bird("Eagle");
        movingObjects[2] = new Bird("Hummingbird");

        for (Movement obj : movingObjects) {
            System.out.println(obj.toString() + ":");
            obj.fly();
            obj.walk();
            obj.jump();
            System.out.println();
        }
    }
}
