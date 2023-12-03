package corejava.multithreading.concurrency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list.stream().flatMapToInt(IntStream::of).sum());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService=new ThreadPoolExecutor(1,2,10, TimeUnit.MILLISECONDS,new PriorityBlockingQueue<>());
        //we can call using execute() method which return type is void
        executorService.execute(new RunnableExample());
        executorService.shutdown();
    }
}
