package CollectionFramework;

import java.util.PriorityQueue;

public class CollectionQueue {
    public static void main(String[] args) {
        //fifo
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i =1000; i>100 ; i--) {
            queue.add(i);

        }
        System.out.println(queue);
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i< queue.size(); i++){
            System.out.print(queue.remove()+"->");
        }

    }
}
