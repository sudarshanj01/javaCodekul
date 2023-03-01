package multithreding;

public class YieldDemo extends Thread {
    public static void main(String[] args) {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for (int i=1; i<=50; i++){
                    System.out.println("in t1");

                }
            }
        });

        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=1; i<=50; i++){
                    System.out.println("in t2");
                }
            }
        });

        t2.start();

    }
}
