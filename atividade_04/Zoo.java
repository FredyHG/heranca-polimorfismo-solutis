package atividade_04;

import atividade_01.Animal;
import atividade_01.Dog;
import atividade_01.Horse;
import atividade_01.Sloth;

public class Zoo {
    private Animal[] enclosures;

    public Zoo() {
        enclosures = new Animal[10];

        enclosures[0] = new Dog("Rex", 5);
        enclosures[1] = new Horse("Spirit", 7);
        enclosures[2] = new Sloth("Sid", 3);
        enclosures[3] = new Dog("Whiskers", 2);
        enclosures[4] = new Horse("Dumbo", 10);
        enclosures[5] = new Dog("Shera", 4);
        enclosures[6] = new Sloth("Leo", 6);
        enclosures[7] = new Sloth("Pingu", 1);
        enclosures[8] = new Dog("Gerry", 8);
        enclosures[9] = new Horse("Zara", 9);
    }

    public void showAnimals() {
        for (Animal animal : enclosures) {
            if (animal != null) {
                animal.emitSound();

                if (animal instanceof RunCapable) {
                    ((RunCapable) animal).run();
                }
            }
        }
    }
}
