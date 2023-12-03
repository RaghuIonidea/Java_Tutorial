package corejava.collections.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
   /*
   1.if your depending on default natural sorting order then the Object must implements Comparable Interface
    and Override public int CompareTo(Object o) method
   */
    public static void main(String[] args) {
        List<ComparableStudent> list = Arrays.asList(
                new ComparableStudent(1,"raghu","Hyd",20),
                new ComparableStudent(2,"Ram","Bang",30),
                new ComparableStudent(3,"Priya","Knl",50),
                new ComparableStudent(4,"Jaya","Pol",10)
        );

        System.out.println("Before sort "+list);
        Collections.sort(list);
        System.out.println("After sort "+list);
    }
}
