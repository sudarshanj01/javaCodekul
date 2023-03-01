package java8;

public class LambdaExpression {
    public static void main(String[] args) {

        MyInterface myInterface=()->{
            System.out.println("in show method");
        };
        myInterface.show();

        MyInterface1 myInterface1=(a,b)->a*b;
        int result =myInterface1.multi(187,2);
        System.out.println(result);



    }
}

interface MyInterface{
    void show();
}

interface MyInterface1{
    int multi(int i,int j);
}
