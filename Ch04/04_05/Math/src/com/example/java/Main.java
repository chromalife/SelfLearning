package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtaction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double)intValue1 / intValue2;
        System.out.println("Division: " + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("Remainder (Modulo): " + result5);

        double doubleValue = -3.99;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: " + absValue);


    }


}
