package collection_framework;

import java.util.*;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListMultiplier {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList( 5, 6,7,8));
        List<Integer> result = new ArrayList<>(list1.size());

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        Collections.reverse(list2);

        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) * list2.get(i));
        }
        System.out.println("Result: " + result);

    }
}







