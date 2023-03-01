package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIstMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(40);

//        System.out.println(list1.containsAll(list2));

//        System.out.println(list1);
//        System.out.println(list2);

//        list1.addAll(list2);
//        list1.retainAll(list2);

        System.out.println(list1.contains(10));
        list1.set(1,10);
        System.out.println(list1);

        System.out.println(list1.isEmpty());
        System.out.println(list1.stream().count());
        System.out.println(list1.subList(2,4));

        String[] arr={"suadrshan","jadhav"};
        int[] arr2={1,2,3,4,5};

        List<String> list=new ArrayList<>(Arrays.asList(arr));

//        ArrayList<Integer> array_list =
//                new ArrayList<Integer>(Arrays.asList(arr2));
//        System.out.print(array_list);

    }
}
