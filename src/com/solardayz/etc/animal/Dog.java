package com.solardayz.etc.animal;

public class Dog implements Animal{

    @Override
    public String name() {
        return "하루";
    }

    @Override
    public int age() {
        return 1;
    }

    @Override
    public int arms() {
        return 0;
    }

    @Override
    public int leg() {
        return 4;
    }

    @Override
    public int bodies() {
        return 1;
    }

    @Override
    public int head() {
        return 1;
    }

    public void sound(){
        System.out.println("Grrrr");
    }
}
