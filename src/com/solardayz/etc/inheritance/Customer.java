package com.solardayz.etc.inheritance;

public class Customer {

    protected long id;
    protected String name;
    protected String grade;
    int point;
    double pointRate;

    public Customer() {
        grade = "FAMILY";
        pointRate = 0.01;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int totalPoint(int price){
        point += price * pointRate;
        return point;
    }

    public String customerInfomation() {
        return "고객명 : " + name + " 등급 : "+ grade + " 포인트 : "+point;
    }
}
