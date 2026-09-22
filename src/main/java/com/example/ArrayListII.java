package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListII {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("a", "b", "c");
        System.out.println(list1.getClass().getName());
        list1.set(2,"d");
        System.out.println(list1);

        List<Integer> list2 = List.of(1, 2, 3);
        System.out.println(list2.getClass().getName());
        System.out.println(list2);

        String[] array = {"a", "b", "c"};
        List<String> list3 = Arrays.asList(array);
        System.out.println(list3.getClass().getName());
    }
}
