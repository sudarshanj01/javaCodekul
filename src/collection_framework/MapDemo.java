package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"sudarshan");
        map.put(2,"sham");
        map.put(3,"krish");

        Map<Integer,String> map2=new HashMap<>();

        map2.put(1,"jk");
        map2.put(2,"am");
        map2.put(3,"kr");

//        map.forEach((integer, s) -> {
//            System.out.println(integer+" "+s);
//        });
//
//        System.out.println();
//
//        for (Map.Entry<Integer,String> m: map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

        ArrayList<Map<Integer,String>> list=new ArrayList<>();
        list.add(map);
        list.add(map2);

        list.forEach(s->{
            System.out.println(s);
        });


    }
}
