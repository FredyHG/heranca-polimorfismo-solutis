package atividade_01;

import atividade_04.RunCapable;

public class Dog extends Animal implements RunCapable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void emitSound() {
        System.out.println("The dog is barking");
    }

    @Override
    public void move() {
        System.out.println("The dog is running");
    }

    @Override
    public void run() {
        this.move();
    }
}
