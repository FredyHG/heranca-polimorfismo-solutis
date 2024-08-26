package atividade_01;

import atividade_04.RunCapable;

public class Horse extends Animal implements RunCapable {

    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void emitSound() {
        System.out.println("The horse is neighing");
    }

    @Override
    public void move() {
        System.out.println("The horse is running");
    }

    @Override
    public void run() {
        this.move();
    }
}
