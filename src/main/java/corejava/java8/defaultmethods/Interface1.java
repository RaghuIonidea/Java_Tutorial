package corejava.java8.defaultmethods;

@FunctionalInterface
public interface Interface1 {
    public String getName();
    public default void defaultMethod1(){
        System.out.println("I am defaultMethod1");
    }
}
