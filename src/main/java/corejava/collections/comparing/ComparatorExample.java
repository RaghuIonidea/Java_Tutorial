package corejava.collections.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    /*
       1.if your depending on custom sorting order then we will use Comparator interface and
         provide implementation to the public int compare(Object o1,Object o2).
       */
    public static void main(String[] args) {
        List<Employee> list= Arrays.asList(new Employee(1,"raghu","Hyd",10000),
                                           new Employee(2,"Ram","Bang",20000),
                                           new Employee(3,"Priya","Knl",30000),
                                           new Employee(4,"Jaya","Pol",60000));
        System.out.println("Before sort "+list);
        Collections.sort(list,new EmployeeComparator());
        System.out.println(" After Sort "+list);
    }
}
class EmployeeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
         if(o1.getSalary()<o2.getSalary())
             return 1;
        if(o1.getSalary()>o2.getSalary())
            return -1;
        if(o1.getSalary()==o2.getSalary())
            return 0;
        return 0;
    }
}

