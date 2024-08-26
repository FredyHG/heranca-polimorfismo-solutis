package atividade_02;

import atividade_01.Animal;
import atividade_01.Dog;
import atividade_01.Horse;
import atividade_01.Sloth;

public class MakeSounds {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex", 5);
        Animal horse = new Horse("Spirit", 7);
        Animal sloth = new Sloth("Sid", 3);


        Animal[] animals = {dog, horse, sloth};

        for (Animal animal : animals) {
            animal.emitSound();
        }
    }
}
