package corejava.generics;

public class GenericClass_ExtendsThread<T extends Thread> {
    T t;
    GenericClass_ExtendsThread(T t){
        this.t=t;
    }
     String getCurrentThreadName(){
        return t.getName();
     }
    public static void main(String[] args) {
        GenericClass_ExtendsThread ge=new GenericClass_ExtendsThread(new CommonThread());
        System.out.println(" Current Thread  Name  "+ge.getCurrentThreadName());
        ge.t.start();
    }
}
