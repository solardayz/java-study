package com.solardayz.etc.inheritance;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("홍길동");
        customer1.setGrade("FAMILY");
        customer1.point = 1000;
        System.out.println(customer1.customerInfomation());

        CustomerVIP customerVIP1 = new CustomerVIP();
        customerVIP1.setName("홍부자");
        customerVIP1.point = 10000;
        System.out.println(customerVIP1.customerInfomation());

    }
}
