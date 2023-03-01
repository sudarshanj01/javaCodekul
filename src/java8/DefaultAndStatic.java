package java8;

public class DefaultAndStatic implements MyInterface5 {
    public static void main(String[] args) {
        DefaultAndStatic obj=new DefaultAndStatic();

        System.out.println(obj.msg());
        obj.display();


        System.out.println(MyInterface5.test());

    }
    public void display(){
        MyInterface5.super.msg();
    }
}

interface MyInterface5{
    default String msg(){
        return "Pune";
    };
    static String test(){
        return "nashik";
    };

}
