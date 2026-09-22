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
    }
}
