package collection_framework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        System.out.println(treeSet);

//
//        System.out.println(treeSet.headSet(30));
//        System.out.println(treeSet.tailSet(30));
//        System.out.println(treeSet.first());
        System.out.println(treeSet1.addAll(treeSet));
        System.out.println(treeSet1);



    }
}