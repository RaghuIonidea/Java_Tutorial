package corejava.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
/*- PriorityQueue is child class of Queue Interface
   if you are adding integer elements to queue,
    lowest value will get the highest priority and will be stored in Head Position

    ex: 1,4,5,8,6,2 here 1 will be stored Head Position remaining elements we can't predict order.
        if we call poll() which removes the Head element from queue i.e 1
        and now 2 will there in Head Position.
    */
public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(4);
        pq.offer(5);
        pq.offer(8);
        pq.offer(6);
        pq.offer(2);
        pq.offer(6);

        System.out.println("Queue elements: "+pq);

        System.out.println("Peek:  "+pq.peek());
        System.out.println("Queue after Peek:  "+pq);

        System.out.println("Queue after Poll:  "+pq.poll());
        System.out.println("Queue after Poll:  "+pq);

        //Empty Queue
    PriorityQueue<Integer> emptyQueue=new PriorityQueue<>();
    System.out.println("Queue elements:  "+emptyQueue);
    System.out.println("Queue after peak:  "+emptyQueue.peek());
    System.out.println("Queue after Poll:  "+emptyQueue.poll());

    PriorityQueue<String> p=new PriorityQueue<>();
    p.offer("Orange");
    p.offer("Grapes");
    p.offer("Banana");
    p.offer("Apple");
    p.offer("Mango");
    p.offer("Papaya");
    p.offer("watermelon");
    p.offer("Avocado");
    p.offer("Ace");

    System.out.println("Queue elements: "+p); //Ace will be in Head
    }
}
