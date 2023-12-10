package corejava.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DistinctMethodExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,3,4,2,5,6);
        System.out.println("List Before Distinct(): "+list);
        System.out.println("List After Distinct(): "+list.stream().distinct().collect(Collectors.toList()));

        List<Employee> employees=Arrays.asList(new Employee(1,"raghu",1000),
                                               new Employee(2,"ram",2000),
                                               new Employee(3,"jay",5000),
                                               new Employee(2,"ram",2000),
                                               new Employee(3,"jay",5000));

        System.out.println("employees Before Distinct(): "+employees.size());
        System.out.println("employees After Distinct():"+employees.stream().distinct().collect(Collectors.toList()).size());
    }
}

class Employee{
    int id;
    String name;
    int sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Employee)
        {
           Employee employee=(Employee) o ;
           if (employee.getName().equals(this.getName()))
               return true;
           else
               return false;
        }
        else
            return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
