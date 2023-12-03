package corejava.multithreading.interthreadcommunication;

import java.util.Queue;

public class Consumer extends Thread{
    public Queue<Integer> queue;
    public static int count=0;
    public Consumer(Queue<Integer> queue){
        this.queue=queue;
    }

    public void run() {
        //put items into queue if queue is empty
        // add the logic inside synchronized block
        while (count <= 10) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (queue) {
                if (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Value consumed: "+queue.peek());
                    queue.poll();
                    count++;
                }

            }
        }
    }
}
