package nl.capgemini.demo.animals;

public class Bird extends Animal {

    private static final String BIRD_SOUND = "tjilp";

    Bird(final float weightInKg) {
        super(BIRD_SOUND, weightInKg, true);
    }

}
