package multithreding;

public class Threadmethods {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in run");

            }
        });
        t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in run 2");

            }
        });
        t2.setName("newThread");
        t2.start();
        t1.setPriority(1);
        System.out.println("t1 alive is "+t1.isAlive());
        System.out.println("the name of thread 2 is "+t2.getName());


    }
}
