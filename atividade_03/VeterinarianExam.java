package atividade_03;

import atividade_01.Animal;
import atividade_01.Dog;
import atividade_01.Horse;
import atividade_01.Sloth;

public class VeterinarianExam {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex", 5);
        Animal horse = new Horse("Spirit", 7);
        Animal sloth = new Sloth("Sid", 3);

        Veterinarian vet = new Veterinarian();

        System.out.println("Examining the dog:");
        vet.examine(dog);

        System.out.println("Examining the horse:");
        vet.examine(horse);

        System.out.println("Examining the sloth:");
        vet.examine(sloth);
    }
}
