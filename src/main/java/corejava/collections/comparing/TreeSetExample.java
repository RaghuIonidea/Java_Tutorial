package corejava.collections.comparing;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class TreeSetExample {
   /*1.Tree Set follows  sorting Order if it is String Alphabetical Order,
    2.if it is Number the Ascending
   3.for custom objects we should implement Comparable interface and override CompareTo method.
   4.it will not allow null values even for first element. Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
   5. for last if we add null then Null pointer Exception*/


    public static void main(String[] args) {

        TreeSet<Employee> notCom=new TreeSet<>();
        notCom.add(new Employee(1,"raghu","Hyd",10000));
        System.out.println(notCom);//Employee cannot be cast to class java.lang.Comparable

        TreeSet<ComparableStudent> treeSet=new TreeSet<>();
        treeSet.add(null);
        treeSet.add(new ComparableStudent(1,"raghu","Hyd",10000));
        treeSet.add(new ComparableStudent(2,"Ram","Bang",20000));
        treeSet.add(new ComparableStudent(3,"Priya","Knl",30000));
        treeSet.add(null);
        System.out.println(treeSet);

    }
}
