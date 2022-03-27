package com.solardayz.inheritance;

public class CustomerVIP extends Customer{

    double pointRate;

    double saleRate;

    public CustomerVIP() {

        pointRate = 0.05;
        saleRate = 0.1;
    }

    public int totalPoint(int price){
        point += price * pointRate;
        return point;
    }

    public String customerInfomation() {
        return "고객명 : " + name + " 등급 : "+ grade + " 포인트 : "+point;
    }
}
