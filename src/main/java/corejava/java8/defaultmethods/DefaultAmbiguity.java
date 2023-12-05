package corejava.java8.defaultmethods;

public class DefaultAmbiguity implements Interface1,Interface2{

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void defaultMethod1() {
       // Interface1.super.defaultMethod1();   OR
        System.out.println("I am overriden method in child");
    }
}
