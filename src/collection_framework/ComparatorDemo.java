package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;

    public ComparatorDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ComparatorDemo obj1=new ComparatorDemo(1,"sudarshan");
        ComparatorDemo obj3=new ComparatorDemo(3,"danny");
        ComparatorDemo obj2=new ComparatorDemo(1,"sam");

        List<ComparatorDemo> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        Collections.sort(list.Comparator.comparing(comparator1));
        list.forEach(s->{
            System.out.println(s.id+" "+s.name);
        });


        Comparator<ComparatorDemo> comparator=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if (o1.id == o2.id) {
                    return 0;
                } else if (o1.id < o2.id) {
                    return 1;

                } else {
                    return -1;
                }
            }
        };

        Comparator<ComparatorDemo> comparator1=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                return o1.name.compareTo(o2.name);
            }
        };



    }
}
