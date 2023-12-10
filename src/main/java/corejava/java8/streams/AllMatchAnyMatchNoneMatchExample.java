package corejava.java8.streams;

import java.util.Arrays;
import java.util.List;

public class AllMatchAnyMatchNoneMatchExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6,7,8,9,10,11,12);
        System.out.println("anyMatch: "+intList.stream().anyMatch(x->x/12==0));
        System.out.println("noneMatch: "+intList.stream().noneMatch(x->x%3==0));
        System.out.println("allMatch: "+intList.stream().allMatch(x->x%2==0));
    }
}
