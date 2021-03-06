package com.udemy;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 3;
        // width of float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms.
        double poundsVar = 200d;
        double onePound = 0.45359237d;
        double resultKg = poundsVar * onePound;
        System.out.println("In 200 lbs = " + resultKg + " kg");


    }
}
