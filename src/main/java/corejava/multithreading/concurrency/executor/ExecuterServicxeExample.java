package corejava.multithreading.concurrency.executor;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ExecuterServicxeExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> callable=()->{
            TimeUnit.MILLISECONDS.sleep(1000);
            return "Current time :: " + LocalDateTime.now();
        };
        Executor executor = Executors.newFixedThreadPool(2);

        //execute the task after some fixed delay
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Future<String> resultFuture = executorService.schedule(callable, 5, TimeUnit.SECONDS);
        System.out.println(resultFuture.get());
        executorService.shutdown();

    }
}
