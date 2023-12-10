package corejava.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipMethodExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        System.out.println("Before limit and Skip the size is : "+studentList.size());
        System.out.println("After limit and Skip the size is: "+studentList.stream().limit(4).skip(2).collect(Collectors.toList()).size());
    }
}
