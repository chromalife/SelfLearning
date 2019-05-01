package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd valuse is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("the Long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.9999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int " + intValue4);
    }

}
