package corejava.java8;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier=()->  "raghu";
        System.out.println(supplier.get());
    }
}
