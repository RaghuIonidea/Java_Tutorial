package corejava.multithreading.concurrency.synchronizationclasses;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class developer1 implements Runnable{
    private CountDownLatch countDownLatch;
    public developer1(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("Task assigned to Developer1 and Name is: "+Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task Completed By Developer1 and Name is: "+Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}

class developer2 implements Runnable{
    private CountDownLatch countDownLatch;
    public developer2(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("Task assigned to Developer2 and Name is: "+Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task Completed By Developer2 and Name is: "+Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}

class Tester implements Runnable{
    @Override
    public void run() {
        System.out.println("Task assigned to Tester and Name is: "+Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task Completed By Tester and Name is: "+Thread.currentThread().getName());
    }
}
public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(2);
        Thread t1 =new Thread(new developer1(countDownLatch));
        Thread t2 =new Thread(new developer2(countDownLatch));

        t1.start();
        t2.start();

        countDownLatch.await();

        Thread t3 =new Thread(new Tester());
        t3.start();
    }
}
