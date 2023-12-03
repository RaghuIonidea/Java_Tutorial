package corejava.multithreading.concurrency.completablefuture;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class RunAsyncExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Before call");
        CompletableFuture<Void> completableFuture= CompletableFuture.runAsync(()->{
            System.out.println(LocalDateTime.now());
        });
        System.out.println(completableFuture.get());
        System.out.println("After call");

        /*By default runAsync() uses fork join pool to excute tasks,
         we can mention custom executor to execute tasks,but we have to shutdown custom executors manullay
         see below example
         */
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        CompletableFuture<Void> completableFuture1=CompletableFuture.runAsync(()->{
            System.out.println("Result of the asynchronous computation");
        }, executorService);
        executorService.shutdown();

    }
}
