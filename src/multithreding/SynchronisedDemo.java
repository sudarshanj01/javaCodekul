package multithreding;

public class SynchronisedDemo {
    static int num;

    private void counter() {
        synchronized (this) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronisedDemo obj =new SynchronisedDemo();
        SynchronisedDemo obj1=new SynchronisedDemo();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=2000; i++){
                    obj.counter();
                }
            }
        });

        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=2000; i++){
                    obj1.counter();
                }
            }
        });

        t2.start();

        t1.join();
        t2.join();


        System.out.println(obj.num);


    }
}
