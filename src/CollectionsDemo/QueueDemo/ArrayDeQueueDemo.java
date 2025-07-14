package CollectionsDemo.QueueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDeQueueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> pq = new ArrayDeque<>();

        pq.offer(12);
        pq.offer(32);
        pq.offer(13);
        pq.offer(42);
        pq.offer(15);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
