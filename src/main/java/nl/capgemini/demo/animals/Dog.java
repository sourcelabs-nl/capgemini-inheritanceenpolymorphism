package nl.capgemini.demo.animals;

public class Dog extends Mammal {

    public Dog(float weightInKg, boolean laysEggs) {
        super("Woof", weightInKg, laysEggs);
    }

    public void buryBone() {
        System.out.println("it's in the ground now");
    }
}
