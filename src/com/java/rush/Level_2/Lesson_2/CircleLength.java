package com.java.rush.Level_2.Lesson_2;

public class CircleLength {
     public static final double Pi = 3.14;

    public static void main(String[] args) {
        printCircleLength(5);

    }

    public static void printCircleLength(int radius) {
        System.out.println(2 * Pi * radius);
    }
}

