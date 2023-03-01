package multithreding;

public class MultithreadingDemo extends Thread{

    public static void main(String[] args) {
        MultithreadingDemo obj =new MultithreadingDemo();
        obj.start();
        System.out.println(Thread.currentThread().getName());


    }
    @Override
    public void run() {
        System.out.println("in run method");
        System.out.println(Thread.currentThread().getName());
    }




}
