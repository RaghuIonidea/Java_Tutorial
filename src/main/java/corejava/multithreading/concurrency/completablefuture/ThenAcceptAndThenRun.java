package corejava.multithreading.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ThenAcceptAndThenRun {
/*we can use theAccept and thenRun methods for last operations*/
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
                    return "Hi Raghu";
                }
        ).thenApply(name->{
            return name+ " Welcome";
        }).thenAccept((name)->{
            System.out.println(name.toString());
        });

        //thenRun() it does not take any arguments
        CompletableFuture.supplyAsync(()->{
                    return "Hi Raghu";
                }
        ).thenRun(()->{
            System.out.println("I am Runnable Task");
        });
    }
}
