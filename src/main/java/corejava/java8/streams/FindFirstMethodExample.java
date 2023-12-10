package corejava.java8.streams;

import java.util.List;
import java.util.Optional;

public class FindFirstMethodExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
         Optional<Student> optionalStudent = studentList.stream().filter(s->s.getName().equalsIgnoreCase("Raghu")).findFirst();
         if(optionalStudent.isPresent())
             System.out.println(optionalStudent.get());
    }
}
