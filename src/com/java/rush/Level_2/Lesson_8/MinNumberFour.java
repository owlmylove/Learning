package com.java.rush.Level_2.Lesson_8;

public class MinNumberFour {
    public static int min(int a, int b, int c, int d) {
        if (d < min(a, b) && d < c) {
            return d;
        } else if (c < min(a, b) && c < d) {
            return c;
        } else {
            return min(a, b);
        }

    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));//
        System.out.println(min(-20, -10, -30, -40));//
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}

