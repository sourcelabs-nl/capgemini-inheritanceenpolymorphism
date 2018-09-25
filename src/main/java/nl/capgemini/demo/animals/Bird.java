package nl.capgemini.demo.animals;

public class Bird extends Animal {

    private static final String BIRD_SOUND = "tjilp";
    private int numberOfEggs;

    Bird(final float weightInKg, final boolean laysEggs, final int numberOfEggs) {
        super(BIRD_SOUND, weightInKg, laysEggs);
        this.numberOfEggs = numberOfEggs;
    }


}
