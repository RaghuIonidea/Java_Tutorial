package corejava.multithreading;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("Rgahu");
        Thread.currentThread().setPriority(1);
        for (int i = 0; i <= 10; i++) {
               System.out.println("I am from Run method My Name is " + Thread.currentThread().getName() + " and Priority is " + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new RunnableClass());
        t.start();
        Thread.currentThread().setPriority(5);
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am from main method  My Name is " + Thread.currentThread().getName() + " and Priority is " + Thread.currentThread().getPriority());
        }
    }
}
