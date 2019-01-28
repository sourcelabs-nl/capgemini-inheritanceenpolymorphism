package nl.capgemini.demo.animals;

public class SuperBird extends Animal {

    private static final String BIRD_SOUND = "tjilp";

    public SuperBird(final float weightInKg) {
        super(BIRD_SOUND, weightInKg, true);
    }

}
