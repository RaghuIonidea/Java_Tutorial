package corejava.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Raghu");
        list.add("ram");
        list.add("pri");
        list.add("jaya");
        list.add("Raghu");

        System.out.println(list);
        System.out.println("4th index "+list.get(4));
    }
}
