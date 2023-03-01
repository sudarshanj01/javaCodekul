package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {
        MethodReferences methodReferences=new MethodReferences();

        //refer method
        MyInterface2 myInterface2=methodReferences::display;

        //call method
        System.out.println(myInterface2.msg());

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        list.forEach(System.out::println);

    }

    public  String display(){
        return "in display method";
    }

}

interface MyInterface2{
     String msg();
}
