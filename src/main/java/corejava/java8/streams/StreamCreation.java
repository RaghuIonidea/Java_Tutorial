package corejava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //we can also apply a stream for group of values and for arrays.
        Stream stream=Stream.of(99,999,9999,99999);
        Stream stream1 = Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));

    }
}
