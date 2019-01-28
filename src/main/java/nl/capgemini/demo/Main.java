package nl.capgemini.demo;

import nl.capgemini.demo.animals.Animal;
import nl.capgemini.demo.animals.Dog;
import nl.capgemini.demo.animals.GoldFish;
import nl.capgemini.demo.animals.SuperBird;

public class Main {

    public static void main(String[] args) {

        GoldFish nemo = new GoldFish(1, true);
        Dog foofer = new Dog(12, false);
        SuperBird pino = new SuperBird(35.5f);

        Animal[] animals = {nemo, foofer, pino};
        callSoundOnTheAnimal(animals);

        GoldFish drunkenNemo = new GoldFish(1, false);
        Animal[] drunkenAnimals = {drunkenNemo};

        callSoundOnTheAnimal(drunkenAnimals);

    }

    private static void callSoundOnTheAnimal(Animal[] animals) {
        for (final Animal animal : animals) {
            animal.makeNoise();

            if(animal instanceof Dog) {
                Dog doggy = (Dog) animal;
                doggy.buryBone();
            }
        }
    }
}
