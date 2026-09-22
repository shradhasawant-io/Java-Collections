package com.example;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorII implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Joy",3.5));
        students.add(new Student("Jack",3.7));
        students.add(new Student("Akshit",3.5));
        students.add(new Student("Rishit",3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);

        /*students.sort((o1,o2) -> {
            if(o2.getGpa() - o1.getGpa() > 0){
                return 1;
            }
            else if(o2.getGpa() - o1.getGpa() < 0){
                return -1;
            }
            else{
                return o1.getName().compareTo(o2.getName());
            }
                });*/

        for(Student s: students){
            System.out.println(s.getName()+" : "+s.getGpa());
        }

        //Collections.sort(students,comparator);
    }
}
