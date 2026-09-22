package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorI implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(13);
        list.add(4);
        list.add(500);
        list.add(60);
        list.add(17);
        //list.sort(null);
        //list.sort(new ComparatorI());
        list.sort((a,b) -> b-a);
        System.out.println(list);

        List<String> l = Arrays.asList("banana", "apple", "orange");
        l.sort((a,b) -> a.length() - b.length());
        //l.sort(Comparator.naturalOrder());
        System.out.println(l);
    }
}
