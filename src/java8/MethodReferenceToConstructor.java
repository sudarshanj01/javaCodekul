package java8;

public class MethodReferenceToConstructor {
    public MethodReferenceToConstructor() {
        System.out.println("In constructor ");
    }

    public static void main(String[] args) {

        MyInterface4 myInterface4=MethodReferenceToConstructor::new;
        myInterface4.methodRef();

    }

}

interface MyInterface4{
    MethodReferenceToConstructor methodRef();
}
