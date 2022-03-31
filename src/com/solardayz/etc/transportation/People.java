package com.solardayz.etc.transportation;

public class People {
    String name;
    int age;
    int money;

    public People(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1300);
        this.money -= 1300;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void totalMoney() {
        System.out.println(name + "님의 총 돈 : "+ money);
    }
}
