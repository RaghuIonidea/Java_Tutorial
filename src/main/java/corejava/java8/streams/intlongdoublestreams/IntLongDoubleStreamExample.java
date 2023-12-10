package corejava.java8.streams.intlongdoublestreams;

import corejava.java8.streams.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntLongDoubleStreamExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        IntStream intStream=IntStream.of(1,2,3,4,5);
        LongStream longStream=LongStream.of(2,6,3,6,7);
        DoubleStream doubleStream=DoubleStream.of(3,8,6,1,8,9);
        //convert stream of student references to IntStream which contains id's and returns max id

        System.out.println("Max id from of id's using IntStream: "+studentList.stream().mapToInt(s->s.getId()).max());
        System.out.println("Min id from of id's using IntStream: "+studentList.stream().mapToInt(s->s.getId()).min());

        studentList.stream().mapToDouble(s->s.getId());
        studentList.stream().mapToLong(s->s.getId());
    }
}
