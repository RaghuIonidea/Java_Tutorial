package corejava.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByAndMappingMethodExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        //print the students group by location
        Map<String, List<Student>> groupByLocationMap = studentList.stream().collect(Collectors.groupingBy(student -> student.getLoc()));
        System.out.println("Students of Hyd loc:"+ groupByLocationMap.get("Hyd").stream().collect(Collectors.toList()));

        /*
        mapping(): sometimes we might need to group data into a type other than the element type.
        */

       Map<String,List<String>> map = studentList.stream().collect(Collectors.groupingBy(student -> student.getLoc(),Collectors.mapping(student -> student.getName(),Collectors.toList())));
        System.out.println("Students of Hyd loc using mapping method :"+map.get("Hyd"));
    }
}
