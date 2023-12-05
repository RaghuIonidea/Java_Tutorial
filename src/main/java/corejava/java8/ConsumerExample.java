package corejava.java8;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer= name-> {System.out.println(name);};
        consumer.accept("Boya Raghu Ramudu");
    }
}
