package corejava.multithreading.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCompose {
    static CompletableFuture<Student> getUsersDetail(String id) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("fetching student based on id");
            return new Student(1, "Rgahu");
        });
    }

    static CompletableFuture<Integer> getCreditRating(Student user) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Returning credit rating based on Student");
            return 1;
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Student student=new Student(1,"Ram");
        CompletableFuture<Integer> result= getUsersDetail("1").thenCompose(s->getCreditRating(student));
        System.out.println(result.get());
    }
}
