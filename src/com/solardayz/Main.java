package com.solardayz;

import com.solardayz.animal.Animal;
import com.solardayz.animal.Dog;

public class Main {

    public static void main(String[] args) {
//        Animal mydog = new Dog();
//        mydog.makeNoise();

        Dog dog = new Dog();
        doAnimalStuff(dog);

    }

    public static void doAnimalStuff(Animal animal) {
        animal.age();
        animal.arms();
    }
}
