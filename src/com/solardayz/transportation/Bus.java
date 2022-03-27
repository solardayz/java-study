package com.solardayz.transportation;

public class Bus {
    String name;
    int passenger;
    int money;

    public Bus(String name) {
        this.name = name;
    }

    public void take (int money) {
        this.money += money;
        passenger++;
    }

    public void busInfo () {
        System.out.println(name + " BUS 승객 수 : "+ passenger + " 수입 : "+ money);
    }
}


