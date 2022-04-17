package com.solardayz.compileerror;

public class CompileInt {
    public static void main(String[] args) {
        int[ ] ar1 = null;
        // java.lang.NegativeArraySizeException
//        int[ ] ar2 = new int [-5];
        int[ ] ar3 = new int['a'];

        //Integer number too large
//        int[ ] ar4 = new int[2147483648];
//        java.lang.NullPointerException
//        ar1[0] = 1;
//        ar2[-1] = 1;
        ar3[0] = 1;

        System.out.println(ar3.length);


//        System.out.println(ar1[0]);
//        System.out.println(ar2[-1]);
        System.out.println(ar3[0]);

    }
}
