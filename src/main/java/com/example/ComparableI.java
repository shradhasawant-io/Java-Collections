package com.example;

import java.util.ArrayList;
import java.util.List;

public class ComparableI {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Joy",3.5));
        students.add(new Student("Jack",3.7));
        students.add(new Student("Akshit",3.5));
        students.add(new Student("Rishit",3.9));

        students.sort(null);
        System.out.println(students);
    }
}
