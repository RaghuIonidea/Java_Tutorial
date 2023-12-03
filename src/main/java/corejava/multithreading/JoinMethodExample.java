package corejava.multithreading;

public class JoinMethodExample extends Thread{
    /*
    *
    *
    * If we are commenting line 28 then both Threads will be executed simultaneously and we can't expect exact execution order.
     If we are not commenting line 28 then main Thread will wait until completing child Thread
     In this the output is Raghu Thread 10 times followed by Main Thread 10 times
times.*/
    @Override
    public void run() {
        Thread.currentThread().setName("Raghu");
        System.out.println("Name is:   "+Thread.currentThread().getName());
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethodExample t=new JoinMethodExample();
        t.start();
        t.join();
        System.out.println("Name is:   "+Thread.currentThread().getName());
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() );
        }
    }
}
