package com.solardayz.etc.transportation;

public class Main {
    public static void main(String[] args) {
        People people = new People("James", 20, 10000);

        Bus bus1 = new Bus("1000");
        people.takeBus(bus1);

        Subway subway1 = new Subway("2호선");
        people.takeSubway(subway1);

        people.totalMoney();
        bus1.busInfo();
        subway1.subwayInfo();
    }
}
