package CollectionFramework;

import java.util.ArrayList;

public class CollectionList {
    //List types : Arraylist, LinkedList, Vector
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Character> list = new ArrayList<>();//char type specific
        list.add('a');
        list.add('b');
        System.out.println(list);
        ArrayList list1 = new ArrayList();//generic
        list1.add("john");
        list1.add("Juie");
        list1.add(1);
        list1.add('A');
        list1.add(true);
        list1.set(2,"Lukaku");
        System.out.println(list1);
        //Iteration
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }


}
