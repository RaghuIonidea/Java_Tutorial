package corejava.multithreading.concurrency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CallableExample implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        return list.stream().flatMapToInt(IntStream::of).sum();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Future<Integer> result= executorService.submit(new CallableExample());
        System.out.println(result.get());
        System.out.println(result.isDone());
        System.out.println(result.isCancelled());
        System.out.println(result.state());
        executorService.shutdown();
    }
}
