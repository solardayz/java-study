package com.solardayz.transportation;

public class Subway {
    String name;
    int passenger;
    int money;

    public Subway(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.money += money;
        passenger++;
    }

    public void subwayInfo () {
        System.out.println(name + " Subway 승객 수 : "+ passenger + " 수입 : "+ money);
    }
}
