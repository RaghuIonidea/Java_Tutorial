package corejava.multithreading.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Before call");
        CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
            return "Result of the asynchronous computation";
        });
        System.out.println("date : "+completableFuture.get());
        System.out.println("after call");
        /*By default supplyAsync() uses fork join pool to excute tasks,
         we can mention custom executor to execute tasks,but we have to shutdown custom executors manullay
         see below example
         */
        ExecutorService executorService=Executors.newFixedThreadPool(1);
        CompletableFuture<String> completableFuture1=CompletableFuture.supplyAsync(()->{
            return "Result of the asynchronous computation";
        }, executorService);
        executorService.shutdown();
        System.out.println(completableFuture1.get());
    }
}

