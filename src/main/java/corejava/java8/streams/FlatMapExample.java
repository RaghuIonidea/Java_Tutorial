package corejava.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        List<Student> studentList1 = Student.getStudents();
        List<Student> studentList2 = Student.getStudents();
        List<List<Student>> listOfStudentList= Arrays.asList(studentList,studentList1,studentList2);
        System.out.println("Before flatMap: "+listOfStudentList);
        System.out.println("After flatMap: "+listOfStudentList.stream().flatMap(Collection::stream).collect(Collectors.toList()));

        //Requiremnet you have list of students from front end and list of students from backend, you have tpo produce  unique elements by comparing id.

        List<Student> frontEndStudentList = Student.getStudents();
        List<Student> dbStudentList = Student.getStudents();


            Map<Integer, Student> map = Stream.of(frontEndStudentList, dbStudentList).flatMap(Collection::stream).collect(Collectors.toMap(s -> s.getId(), Function.identity()));
            System.out.println(map.size());

    }
}
