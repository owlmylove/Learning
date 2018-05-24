package com.java.rush.Level_2.Lesson_8;

public class MinNumber {
    public static int min(int a, int b, int c) {
        if (a < b && a <= c){
            return a;
        }
        else if(c < a && c < b){
            return c;
        }
        else{
            return b;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));//
        System.out.println(min(-1, -2, -3));//
        System.out.println(min(3, 5, 3));//
        System.out.println(min(10, 5, 10));
    }

}


