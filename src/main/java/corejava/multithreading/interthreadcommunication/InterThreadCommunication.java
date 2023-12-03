package corejava.multithreading.interthreadcommunication;

import java.util.PriorityQueue;
import java.util.Queue;

public class InterThreadCommunication {

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue=new PriorityQueue<>();
        Producer p=new Producer(queue);
        Consumer c=new Consumer(queue);
        p.start();
        c.start();
    }
}
