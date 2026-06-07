
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

// package Collection Frameworks;

public class priorityqueue {    
    public static void main(String[] args) {

        Queue<Integer>pq = new PriorityQueue<>();

        // integer less value high priority

        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq.poll());
       




    }
}
