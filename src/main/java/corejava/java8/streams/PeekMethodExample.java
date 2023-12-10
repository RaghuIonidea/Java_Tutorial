package corejava.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PeekMethodExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        System.out.println("Student salaries before increment: "+studentList.stream().map(s->s.getSalary()).collect(Collectors.toList()));
        System.out.println("Student salaries after increment: "+studentList.stream().peek(s->{s.setSalary(s.getSalary()+1000);}).map(s->s.getSalary()).collect(Collectors.toList()));
    }
}
