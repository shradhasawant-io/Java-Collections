package com.example;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListI {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(0,0);
        System.out.println(list);

        list.set(0,9);
        System.out.println(list);

        System.out.println(list.get(0));

        list.addFirst(10);
        list.addLast(20);
        System.out.println(list);

        list.removeIf((x)-> x%2==0);
        System.out.println(list);

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a","b","c","d"));
        System.out.println(linkedList);
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("aa","bb"));
        System.out.println(linkedList2);
        linkedList.removeAll(linkedList2);
        System.out.println(linkedList2);
        System.out.println(linkedList);
    }
}
