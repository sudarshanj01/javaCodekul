package multithreding;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProducerConsumerProblem {

    LinkedList<Integer> list=new LinkedList();
    int value =0;

    public void produce() throws InterruptedException{
        while (true){
            synchronized (this){
                while (list.size()<0)
                    wait();

                System.out.println("produce data"+value);
                list.add(value);
                value++;
                notify();

            }
        }
    }

    public void consume() throws InterruptedException{
        while (true){
            synchronized (this){
                while(list.size()==0)
                    wait();

                int value=list.removeFirst();
                System.out.println("consumer"+value);
                value++;
                notify();

                Thread.sleep(1000);
                }
            }
        }

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumerProblem pc =new ProducerConsumerProblem();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
