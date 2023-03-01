package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo>{

    int id;
    String name;

    public ComparableDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ComparableDemo obj1=new ComparableDemo(1,"sudarshan");
        ComparableDemo obj3=new ComparableDemo(3,"danny");
        ComparableDemo obj2=new ComparableDemo(2,"sam");

        List<ComparableDemo> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);



     list.forEach(s->{
         System.out.println(s.id+" "+s.name);
     });



    }

    @Override
    public int compareTo(ComparableDemo o) {
        if(o.id==this.id){
            return 0;
        }else if (o.id<this.id){
            return 1;

        }else {
            return -1;
        }

    }
}
