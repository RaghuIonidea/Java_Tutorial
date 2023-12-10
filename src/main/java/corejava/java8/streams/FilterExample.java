package corejava.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        studentList.stream()
                .filter(s->s.getLoc().equalsIgnoreCase("hyd"))
                .forEach(System.out::println);

        //multiple filters
        studentList.stream()
                .filter(s->s.getLoc().equalsIgnoreCase("hyd"))
                .forEach(System.out::println);

    }
}
