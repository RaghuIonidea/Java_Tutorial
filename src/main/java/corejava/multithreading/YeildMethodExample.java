package corejava.multithreading;

public class YeildMethodExample extends Thread{
    /*
    *
    * In the below programme child Thread always calling yield() method and
      hence main Thread will get the chance more number of times for execution.
     Hence the chance of completing the main Thread first is high.
     Note : Some operating systems may not provide proper support for yield() method.
    */

    @Override
    public void run() {
        Thread.currentThread().setName("Rgahu");
        Thread.currentThread().setPriority(5);
        for (int i = 0; i <= 10; i++) {
            Thread.yield();
            System.out.println("I am from Run method My Name is " + Thread.currentThread().getName() + " and Priority is " + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new RunnableClass());
        t.start();
        Thread.currentThread().setPriority(5);
       // Thread.currentThread().setPriority(1);
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am from main method  My Name is " + Thread.currentThread().getName() + " and Priority is " + Thread.currentThread().getPriority());
        }
    }
}
