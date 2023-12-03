package corejava.generics;

public class CommonThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("I am CommonThread class");
    }
}
