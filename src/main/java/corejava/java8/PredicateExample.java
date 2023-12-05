package corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<student> predicate=s->{
            if(s.getName().equalsIgnoreCase("raghu"))
                return true;
            else
                return false;
        };
        System.out.println(predicate.test(new student(1,"raghur","hyd")));

        //create list of students and check if he belongs to bang location, list those students
        List<student> students= Arrays.asList(new student(1,"raghur","hyd"),
                new student(2,"ram","bang"),
                new student(3,"ramudu","bang"),
                new student(4,"priya","chenn"),
                new student(5,"jaya","pune"));

        System.out.println(" count of students: "+students.stream().filter(s->s.getLoc().equalsIgnoreCase("bang")).count());
    }//main

}//class
class  student{
    int id;
    String name;
    String loc;

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

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public student(int id, String name, String loc) {
        this.id = id;
        this.name = name;
        this.loc = loc;
    }
}