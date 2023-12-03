//package corejava.multithreading.concurrency.completablefuture;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Phaser;
//class NormalTask implements Runnable{
//
//    private Phaser phaser;
//    public NormalTask(Phaser phaser){
//        this.phaser=phaser;
//    }
//    @Override
//    public void run() {
//        System.out.println("I am NormalTask and executed by thread Name: "+Thread.currentThread().getName());
//        System.out.println("I am NormalTask arrived");
//        phaser.arrive(); //similar like countdown()
//
//
//        phaser.arriveAndDeregister();
//    }
//}
//
//class DynamicallyRegisterPhaserTask1 implements Runnable{
//    private Phaser phaser;
//    public DynamicallyRegisterPhaserTask1(Phaser phaser){
//        this.phaser=phaser;
//    }
//    @Override
//    public void run() {
//
//        System.out.println("I am DynamicallyRegisterPhaserTask1 and executed by thread Name: "+Thread.currentThread().getName());
//        System.out.println("I am DynamicallyRegisterPhaserTask1 arrived");
//        phaser.arrive(); //similar like countdown()
//
//
//        phaser.arriveAndDeregister();
//    }
//}
//
//class DynamicallyRegisterPhaserTask2 implements Runnable{
//    private Phaser phaser;
//    public DynamicallyRegisterPhaserTask2(Phaser phaser){
//        this.phaser=phaser;
//    }
//    @Override
//    public void run() {
//
//        System.out.println("I am DynamicallyRegisterPhaserTask2 and executed by thread Name: "+Thread.currentThread().getName());
//        System.out.println("I am DynamicallyRegisterPhaserTask2 arrived");
//        phaser.arrive(); //similar like countdown()
//
//
//        phaser.arriveAndDeregister();
//    }
//}
//
//
//public class PhaserAsCountDownLatchExample {
//    public static void main(String[] args) {
//        Phaser phaser=new Phaser(3);// initial parties 1
//
//        new Thread(new NormalTask(phaser)).start();
//        new Thread(new DynamicallyRegisterPhaserTask1(phaser)).start();
//        new Thread(new DynamicallyRegisterPhaserTask2(phaser)).start();
//
//        phaser.arriveAndAwaitAdvance();
//        phaser.arriveAndAwaitAdvance();
//        phaser.arriveAndAwaitAdvance();//like await() in countDownlatch
//
//        System.out.println("Main Thread Execution after all other threads waits completed");
//    }
//}
