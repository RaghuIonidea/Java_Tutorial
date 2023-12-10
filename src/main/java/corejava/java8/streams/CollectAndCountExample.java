package corejava.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectAndCountExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        Map<Integer,Student> map = studentList.stream().collect(Collectors.toMap(s->s.getId(), s->s));
        System.out.println(map.keySet());

        long sizeOfMap = studentList.stream().count();
        System.out.println(sizeOfMap);

    }
}
