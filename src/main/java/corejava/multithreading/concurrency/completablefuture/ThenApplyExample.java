package corejava.multithreading.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenApplyExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a CompletableFuture
        CompletableFuture<String> nameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "RaghuRam";
        });

        // Attach a callback to the Future using thenApply()
        CompletableFuture<String> greetFuture = nameFuture.thenApply(name->{
            return "Hello Mr."+name;
        });
        // Attach a callback again to the Future using thenApply()
        CompletableFuture<String> finalFuture= greetFuture.thenApply(greeting->{
            return greeting+" Welcomr to Completable Future Example";
        });

        // Block and get the result of the future.
        System.out.println(finalFuture.get());


        //OR
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "RaghuRam";
        }).thenApply(name->{
            return "Hi Mr. "+name;
        }).thenApply(greet->{
            return greet+" Welcome to Completable Future Example";
        });
        future.join();
        System.out.println(future.get());
    }
}
