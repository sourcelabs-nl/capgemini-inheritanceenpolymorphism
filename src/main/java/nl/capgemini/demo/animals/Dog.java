package nl.capgemini.demo.animals;

public class Dog extends Mammal {

    private static final String DOG_SOUND = "woof";

    public Dog(final float weightInKg, final boolean laysEggs) {
        super(DOG_SOUND, weightInKg, laysEggs);
    }
}
