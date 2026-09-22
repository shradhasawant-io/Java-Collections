package com.example;

import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(83);
        list.add(1);
        list.add(1);
        list.add(90);

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int i: list){
            System.out.println(i);
        }

        System.out.println(list.remove(4));
        System.out.println(list);

        System.out.println(list.contains(90));
        list.add(4,600);
        System.out.println(list);
    }
}
