package multithreding;

public class RunnableInterfaceDemo implements Runnable {
    public static void main(String[] args) {
        RunnableInterfaceDemo obj=new RunnableInterfaceDemo();
        Thread obj1=new Thread(obj);
        obj1.start();

    }

    @Override
    public void run() {
        System.out.println("Run method is executed");
    }

}
