package corejava.collections.set;

import java.util.*;

public class LinkedHashSetExample {

    /*
    * underlaying Data Structure is HashTable + LinkedList
    * if you add Object into HashSet
    * 1.first hashCode will be called on that Object ,
    * 2.find right bucket put the object into that bucket and refference will be stored in the LinkedList in sequence.
    *
    * */

    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("raghu");
        set.add("ram");
        set.add("priya");
        set.add("raghu");
        set.add("jaya");
        set.add("hari");
        set.add("suri");
        set.add("raghu");
        System.out.println(set);

    }

}
