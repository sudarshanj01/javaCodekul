package java8;

//StreamApi

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamApi {

    public static void main(String[] args) {

        Function<String,Integer> length=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println( length.apply("Sudarshan"));

        Function<Integer,Integer> add=(num)->num+10;
        System.out.println(add.apply(10));

        Function<Integer,Integer> multi=(num)->num*10;
        System.out.println(multi.apply(10));

        Function<Integer,Integer> andThen= add.andThen(multi);
        System.out.println(andThen.apply(10));

        Function<Integer,Integer> compose= add.compose(multi);
        System.out.println(compose.apply(10));

        System.out.println();


        // .map method
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,10);
        Function<Integer,Integer> multiplier = (n)->n*5;

        list.stream().map(multiplier).forEach(System.out::println);

        Function<Integer,String> EO=(num)->num%2==0 ? "even" : "odd";

        List<String> list1=Arrays.asList("suadrshan","jadhav","mahesh");
        list1 .stream().map((str)->str.toUpperCase()).forEach(System.out::println);


        System.out.println();
        List list2= Arrays.asList(1,2,3,4,5,10,101);
        Predicate<Integer> predicate=(num)->num<10;
        list2.stream().filter(predicate).forEach(System.out::println);
    }

}
