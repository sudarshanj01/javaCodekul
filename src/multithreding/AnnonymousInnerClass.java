package multithreding;

public class AnnonymousInnerClass {

    public static void main(String[] args) {
        //            @Override
//            public String display() {
//                return null;
//            }
        Myinterface obj = () -> "hello";

        System.out.println(obj.msg());

    }
}

interface Myinterface{
    String msg();

//    String display();
}

