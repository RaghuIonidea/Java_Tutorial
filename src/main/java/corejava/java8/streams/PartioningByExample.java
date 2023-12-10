package corejava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PartioningByExample {
    public static void main(String[] args) {

        Map<Boolean,List<Integer>> map = IntStream.range(1,100).boxed().collect(Collectors.partitioningBy(x->x%2==0));
        map.keySet().stream().forEach(key-> {
            if(key)
                System.out.println("even numbers from 1 to 99 "+map.get(key));
            else
                System.out.println("odd numbers from 1 to 99 "+map.get(key));

        });

        //OR in single line

        LongStream.range(1,100).boxed().collect(Collectors.partitioningBy(element->element%2==0)).keySet().parallelStream().forEach(key->{
                if(key)
                    System.out.println("even numbers from 1 to 99 parallelstream "+map.get(key));
                else
                    System.out.println("odd numbers from 1 to 99 paralle stream "+map.get(key));
        });


    }
}
