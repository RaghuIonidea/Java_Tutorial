package corejava.multithreading.interthreadcommunication;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread{
    public Queue<Integer> queue;
    public static int count=0;
    public Producer(Queue<Integer> queue){
        this.queue=queue;
    }
    @Override
    public void run(){
        //put items into queue if queue is empty
        // add the logic inside synchronized block
        while (count<=10){
            synchronized (queue) {
                if (queue.isEmpty()) {
                    queue.offer(generateNumber());
                    System.out.println("Value produced: "+queue.peek());
                    count++;
                    queue.notifyAll();
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private Integer generateNumber()
    {
        return new Random().nextInt(0,100);
    }
}
