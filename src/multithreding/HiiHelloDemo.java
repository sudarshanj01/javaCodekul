package multithreding;

public class HiiHelloDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread obj =new Thread(()->{
            for (int i=1; i<5; i++){
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread obj1 =new Thread(()->{
            for (int i=1; i<5; i++){
                System.out.println("hiee");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        obj.start();
        obj1.start();

        obj.join();
        obj1.join();

        System.out.println("exit");


    }

}
