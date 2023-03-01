package collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(59);

        System.out.println(queue.poll());//remove and return the element
        System.out.println(queue);
        System.out.println(queue.peek());


    }

}
