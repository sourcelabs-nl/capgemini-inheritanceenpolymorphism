package nl.capgemini.demo.animals;

public class Animal {

    private String noise;
    private float weightInKg;
    private boolean laysEggs;

    public Animal(String noise, float weightInKg, boolean laysEggs) {
        this.noise = noise;
        this.weightInKg = weightInKg;
        this.laysEggs = laysEggs;
    }

    public void makeNoise() {
        System.out.println("The " + this.getClass().getSimpleName() + " says " + noise);
    }

    public void printWeightInKg() {
        System.out.println("This " + this.getClass().getSimpleName() + " weights: " + weightInKg + " in kg.");
    }

    public void laysEggs() {
        System.out.println("This " + this.getClass().getSimpleName() + " lays " + getYesOrNo(laysEggs) + "eggs");
    }

    private String getYesOrNo(boolean shouldDisplayYes) {
        if (shouldDisplayYes) {
            return "yes";
        }
        return "no";
    }
}
