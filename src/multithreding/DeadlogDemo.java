package multithreding;

public class DeadlogDemo {
    public static void main(String[] args) {
        String scanner="scanner";
        String printer="printer";
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (scanner){
                    System.out.println(Thread.currentThread().getName()+" is locked by "+scanner);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (printer){
                        System.out.println(Thread.currentThread().getName()+" is locked by "+printer);
                    }
                }

            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (printer){
                    System.out.println(Thread.currentThread().getName()+" is locked by "+printer);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (scanner){
                        System.out.println(Thread.currentThread().getName()+" is locked by "+scanner);

                    }
                }

            }
        });

        t1.setName("laptop1");
        t2.setName("laptop2");

        t1.start();
        t2.start();
    }


}
