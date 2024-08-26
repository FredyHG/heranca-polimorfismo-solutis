package atividade_01;

public class Sloth extends Animal {
    public Sloth(String name, int age) {
        super(name, age);
    }

    @Override
    public void emitSound() {
        System.out.println("The sloth is emit sound");
    }

    @Override
    public void move() {
        System.out.println("The sloth is climbing the trees slowly");
    }
}
