
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

// package Collection Frameworks;

public class queue {    
    public static void main(String[] args) {

// using linkedlist

// Queue<Integer>q = new LinkedList<>();

// q.offer(10);
// q.offer(20);
// q.offer(30);

// System.out.println(q);

// System.out.println("poll: " + q.poll());

// System.out.println(q);

// System.out.println("peek: " + q.peek());



// using arraydeque

   Deque<Integer>d = new ArrayDeque<>();

   d.offer(10);
   d.offerFirst(5);
   d.offerLast(50);

   System.out.println(d);


   d.pollLast();

   System.out.println(d);

   d.pollFirst();

      System.out.println(d);

      System.out.println(d.size());
      System.out.println(d.peek());
      System.out.println(d.peekFirst());
    System.out.println(d.peekLast());

    }
}
