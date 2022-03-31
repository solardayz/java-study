package com.solardayz.innerclass;

class OutClass {

    private int num = 100;
    private static int staticInt = 200;
    private InnerClass innerClass;

    public OutClass() {
        innerClass = new InnerClass();
    }

    class InnerClass {
        int innerClassNum = 10;
        void innerClassPrint() {
            System.out.println("num : "+num);
            System.out.println("staticInt : "+staticInt);
            System.out.println("innerClassNum : "+innerClassNum);
        }
    }

    public void print() {
        innerClass.innerClassPrint();
    }

    static class InnerStaticClass {
        int innerStaticNum = 1000;
        static int staticInnerNum = 2000;

        void innerStaticPrint() {
            System.out.println("innerStaticNum : "+innerStaticNum);
            System.out.println("staticInt : "+staticInt);
            System.out.println("staticInnerNum : "+staticInnerNum);
        }

        static void staticInnertPrint() {
            System.out.println("staticInt : "+staticInt);
            System.out.println("staticInnerNum : "+staticInnerNum);
        }
    }
}

public class InnerClassPractice {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.print();

        OutClass.InnerClass innerClass = outClass.new InnerClass();
        innerClass.innerClassPrint();

        OutClass.InnerStaticClass staticClass = new OutClass.InnerStaticClass();
        staticClass.innerStaticPrint();

        OutClass.InnerStaticClass.staticInnertPrint();
    }
}
