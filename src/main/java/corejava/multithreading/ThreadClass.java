package corejava.multithreading;

public class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("I am from Run method My Name is "+Thread.currentThread().getName()+" and Priority is "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadClass tc=new ThreadClass();
        tc.start();
        System.out.println("I am from main method  My Name is "+Thread.currentThread().getName()+" and Priority is "+Thread.currentThread().getPriority());
    }
}
