package corejava.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.add("Raghu");
        list.add("ram");
        list.add("pri");
        list.add("jaya");
        list.add("Raghu");

        System.out.println(list.get(0));

    }
}
