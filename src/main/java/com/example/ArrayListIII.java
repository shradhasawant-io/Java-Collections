package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIII {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        //System.out.println(l);

        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, 10);
        l.addAll(list);
        System.out.println(l);
    }

}
