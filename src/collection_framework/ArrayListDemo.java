package collection_framework;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * arraylist maintain insertion order
 * arraylist stores duplicate values
 *
 */

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

        List<Integer> list=new ArrayList<>();
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2=new ArrayList<>(Arrays.asList(10,20,30));
        List<Integer> list3=new ArrayList<>(List.of(1,2,3,4,4,6));

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);





    }
}
