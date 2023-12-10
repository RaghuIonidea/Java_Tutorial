package corejava.java8.streams;

import java.util.stream.Stream;

public class TakeWhileandDropWhileExample {
    public static void main(String[] args) {
        //it prints values upto 5 then it stops
        Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0)
                .takeWhile(x -> x <= 5)
                .forEach(System.out::println);
        System.out.println("-------------------------------------");
        //it prints from 5 onwards
        Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0)
                .dropWhile(x -> x <= 5)
                .forEach(System.out::println);
    }
}
