package corejava.multithreading.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionHandle {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer age = -9;

        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
            if(age < 0)
                throw new IllegalArgumentException("Age can not be negative");
            if(age > 18)
                return "Adult";
            else
                return "Child";
        }).exceptionally(ex -> {
            System.out.println("Oops! We have an exception - " + ex.getMessage());
            return "";
        });
        System.out.println(maturityFuture.get());
    }
}
