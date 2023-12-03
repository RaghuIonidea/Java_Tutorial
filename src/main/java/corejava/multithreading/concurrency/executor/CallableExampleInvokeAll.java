package corejava.multithreading.concurrency.executor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableExampleInvokeAll {

    public static void main(String[] args) {
        //Demo Callable task
        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(1000);
            return "Current time :: " + LocalDateTime.now();
        };
        List<Callable<String>> tasksList = Arrays.asList(callableTask, callableTask, callableTask);
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        //1. execute tasks list using invokeAll() method
        try
        {
            List<Future<String>> results = executorService.invokeAll(tasksList);

            for(Future<String> result : results) {
                System.out.println(result.get());
            }
        }
        catch (InterruptedException | ExecutionException e1)
        {
            e1.printStackTrace();
        }
        executorService.shutdown();
    }
}
