package com.java.rush.Level_2.Lesson_6;

public class PrimitivesStudents {
    public static void main(String[] args) {
        Student olga = new Student();
        olga.name = "Olga";
        olga.age = 25;

        Student vera = new Student();
        vera.name = "Vera";
        vera.age = 24;

        System.out.println("Olga is " + olga.age);
        System.out.println("Vera is " + vera.age);

        ageSwap(olga, vera);


    }

    private static void ageSwap(Student a, Student b) {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }

    static class Student {
        String name;
        int age;
    }
}
