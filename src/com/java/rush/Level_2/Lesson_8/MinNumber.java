package com.java.rush.Level_2.Lesson_8;

public class MinNumber {
    public static int min(int a, int b, int c) {

        if (a < b && b < c) {
            return a;
        } else if (c < b && c < a) {
            return c;
        } else if (a < b && c < b) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }

}


