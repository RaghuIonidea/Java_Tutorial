package corejava.java8.streams;

import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        studentList.stream().map(s->s.getName()).forEach(System.out::println);
    }
}
