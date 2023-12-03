package corejava.multithreading.concurrency.synchronizationclasses;

import corejava.multithreading.concurrency.completablefuture.Student;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.CompletableFuture.runAsync;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Student> studentExchanger=new Exchanger<>();
        Runnable r1=()->{
            Student student=new Student(1,"Rgahu");
            System.out.println("I am studentFromRunnable1 Exchanging Student: "+student);
            try {
                Student studentFromRunnable2 = studentExchanger.exchange(student);
                TimeUnit.SECONDS.sleep(5);
                System.out.println("I am studentFromRunnable1 received  Student object from studentFromRunnable2: "+studentFromRunnable2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r2=()->{
            Student student=new Student(2,"Ramu");
            System.out.println("I am studentFromRunnable2 Exchanging Student: "+student);
            try {
                Student studentFromRunnable1 = studentExchanger.exchange(student);
                TimeUnit.SECONDS.sleep(5);
                System.out.println("I am studentFromRunnable2 received Student object from studentFromRunnable1: "+studentFromRunnable1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        CompletableFuture.allOf(runAsync(r1),runAsync(r2)).join();
    }
}
