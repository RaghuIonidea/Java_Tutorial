package corejava.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    /*HashSet underlaying data structure is HashTable so objects will inserted based on hashCode*/
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("raghu");
        set.add("ram");
        set.add("priya");
        set.add("jaya");

        System.out.println("HashSet "+set);

        /* if WE replace HashSet with LinkedHashSet then order will be preserved,
           because underlaying DataStructure is HashTable + LinkedList*/

        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("raghu");
        linkedHashSet.add("ram");
        linkedHashSet.add("priya");
        linkedHashSet.add("jaya");

        System.out.println("LinkedHashSet "+linkedHashSet);
    }
}
