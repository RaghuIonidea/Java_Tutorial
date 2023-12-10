package corejava.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class SortStreamElements {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        //by default it prints based on id because student class implemented Comparable and
        // override compareTo method based on id.
        System.out.println(studentList.stream().sorted().collect(Collectors.toList()));
        //customized order
        System.out.println(studentList.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList()));
    }
}
