package corejava.java8.streams;

import java.util.stream.Stream;

public class InfiniteStreamsExample {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
