package collection_framework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();

        linkedList1.add(10);
        linkedList1.add(20);
        linkedList1.add(30);

        linkedList1.offer(100);
//        System.out.println(linkedList1);
//        System.out.println(linkedList1.peek());
//        System.out.println(linkedList1.poll());
        System.out.println(linkedList1.clone());
        System.out.println(linkedList1.isEmpty());

    }
}
