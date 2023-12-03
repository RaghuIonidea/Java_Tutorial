package corejava.multithreading.concurrency.synchronizationclasses;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

class Task1 implements Runnable{
   private CyclicBarrier cb;
   public Task1(CyclicBarrier cb){
       this.cb=cb;
   }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I am Task1 executed by: "+Thread.currentThread().getName()+" and Reached common point");
            cb.await();
            System.out.println("I am Task1 Crossed barrier");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}

class Task2 implements Runnable{
    private CyclicBarrier cb;
    public Task2(CyclicBarrier cb){
        this.cb=cb;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I am Task2 executed by: "+Thread.currentThread().getName()+" and Reached common point");
            cb.await();
            System.out.println("I am Task2 Crossed barrier");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}

class Task3 implements Runnable{
    private CyclicBarrier cb;
    public Task3(CyclicBarrier cb){
        this.cb=cb;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I am Task3 exceuted by: "+Thread.currentThread().getName()+" and Reached common point");
            cb.await();
            System.out.println("I am Task3 Crossed barrier");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}


public class CyclicBarrierExample {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("All threads reached common point and I am Runnable action,executed by last Thread and Name is : "+Thread.currentThread().getName());
        };
        CyclicBarrier cb=new CyclicBarrier(3,runnable);
        Thread t1=new Thread(new Task1(cb));
        Thread t2=new Thread(new Task2(cb));
        Thread t3=new Thread(new Task3(cb));
        t1.start(); t2.start(); t3.start();
    }
}
