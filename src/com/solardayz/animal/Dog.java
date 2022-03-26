package com.solardayz.animal;

public class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("I am a dog!");
    }

    public void growl() {
        System.out.println("Grrrr");
    }
}
