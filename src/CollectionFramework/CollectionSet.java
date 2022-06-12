package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        // We cannot add duplicate element
        // Three different implementation
        // HashSet, LinkedHashSet, TreeSet
        HashSet<String> set = new HashSet<>();
        set.add("john");
        set.add("jenny");
        set.add("alex");
        set.add("jenny");
        set.add("Mubin");
        set.add("Samindra");
        System.out.println(set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+"->");
        }
        System.out.println();

        // LinkedHashSet (maintain insertion order)
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("John");
        set1.add("Megan");
        set1.add("Megan");
        set1.add("Mubin");
        set1.add("Samindra");
        System.out.println(set1);
        System.out.println(set1.contains("Mubin"));

        // TreeSet (Unordered data will be sorted)
        TreeSet<String> set2 = new TreeSet();
        set2.add("Mubin");
        set2.add("Samindra");
        set2.add("No");
        set2.add("Abc");
        set2.add("Bcd");
        set2.add("Def");
        set2.add("Faa");
        set2.add("Naa");

        System.out.println(set2);

    }


}
