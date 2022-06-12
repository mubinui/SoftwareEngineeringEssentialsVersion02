package CollectionFramework;

import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        //Map and Hashmap
        //Just a set of key-value pair
        // Map dont maintain a order
        Map<Character,String> mymap = new HashMap<>();
        mymap.put('A',"Apple");
        mymap.put('B',"Banana");
        mymap.put('C',"Coconut");
        mymap.put('D',"Duke");
        mymap.put('E',"Elephoca");
        mymap.put('F',"Fruitica");
        System.out.println(mymap);
        System.out.println(mymap.get('A'));
        System.out.println(mymap.containsKey('F'));
        System.out.println(mymap.values());

        // HashMap is also a kind of
        HashMap<Integer,String> myhash = new HashMap<>();
        myhash.put(1,"Mubin");
        myhash.put(102,"Samindra");
        myhash.put(103,"Murdak");
        myhash.put(104, "Mendas");
        myhash.put(105, "Shown");
        myhash.put(106, "Glammer");
        myhash.put(107, "Flower");
        myhash.put(1011, "Suka Muk");
        myhash.put(1022, "Danke");
        myhash.put(1023, "Monkey");
        myhash.put(1025,"Putkye");
        System.out.println(myhash);
        // Treemap (Sorted by keys )
        TreeMap<Integer, String> myhash1 = new TreeMap<>();
        myhash1.put(1,"Mubin");
        myhash1.put(102,"Samindra");
        myhash1.put(113,"Murdak");
        myhash1.put(104, "Mendas");
        myhash1.put(115, "Shown");
        myhash1.put(106, "Glammer");
        myhash1.put(107, "Flower");
        myhash1.put(1011, "Suka Muk");
        myhash1.put(1022, "Danke");
        myhash1.put(1023, "Monkey");
        myhash1.put(1025,"Putkye");
        myhash1.putIfAbsent(10222,"UIC");
        System.out.println(myhash1);
        // LinkedHashMap (Maintains insertion order)
        LinkedHashMap<Integer,String> myhash2 = new LinkedHashMap<>();
        myhash2.put(1,"Mubin");
        myhash2.put(110,"Samindra");
        myhash2.put(103,"Murdak");
        myhash2.put(113, "Mendas");
        myhash2.put(105, "Shown");
        myhash2.put(106, "Glammer");
        myhash2.put(107, "Flower");
        myhash2.put(1011, "Suka Muk");
        myhash2.put(1022, "Danke");
        myhash2.put(1023, "Monkey");
        myhash2.put(1025,"Putkye");
        myhash2.putIfAbsent(10222,"UIC");
        System.out.println(myhash2);


    }
}
