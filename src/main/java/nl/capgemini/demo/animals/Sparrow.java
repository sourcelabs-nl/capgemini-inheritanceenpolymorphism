package nl.capgemini.demo.animals;

public class Sparrow extends Bird {

    private static final float AVERAGE_SPARROW_WEIGHT_IN_KG = 0.3f;

    public Sparrow(final boolean laysEggs, final int numberOfEggs) {
        super(AVERAGE_SPARROW_WEIGHT_IN_KG, laysEggs, numberOfEggs);
    }
}
