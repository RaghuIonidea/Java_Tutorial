package corejava.multithreading.concurrency.executor;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecuterExample {

    public static void main(String[] args) {

        ///execute the task after some fixed delay and repaet same task for every given time
        Runnable runnable=()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Current  :: " + LocalDateTime.now());

        };
        ScheduledExecutorService executorService1 = Executors.newSingleThreadScheduledExecutor();
        executorService1.scheduleAtFixedRate(runnable, 2, 2,TimeUnit.SECONDS);

           //executorService1.shutdown();
        // if we dont comment it will keep on executing
    }
}
