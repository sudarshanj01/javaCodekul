package java8;

public class MethodReferenceToStatic {
    public static void main(String[] args) {

        MyInterface3 myInterface3 = MethodReferenceToStatic::display;
        System.out.println(myInterface3.msg());

    }
    public static String display(){
        return "in display method";
    }
}

interface MyInterface3{
 String msg();
}

