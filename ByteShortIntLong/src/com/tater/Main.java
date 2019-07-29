package com.tater;

public class Main {

    public static void main(String[] args) {
	// write your code here

        short myMaxShortValue = Short.MAX_VALUE;
        short myNewShortValue = (short) (myMaxShortValue / 2);

        byte myByteHole = 12;
        short myShortHole = 5000;
        int myIntHole = 45000;
        long myLongHole = 50000 + (myByteHole + myShortHole + myIntHole) * 10;
        System.out.println("myLongHole value is: " + myLongHole);

        System.out.println(myByteHole);
        System.out.println(myShortHole);
        System.out.println(myMaxShortValue);
        System.out.println(myIntHole);

    }
}
