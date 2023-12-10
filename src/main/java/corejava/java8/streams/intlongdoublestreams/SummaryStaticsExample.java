package corejava.java8.streams.intlongdoublestreams;

import corejava.java8.streams.Student;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SummaryStaticsExample {
    public static void main(String[] args) {

        IntSummaryStatistics intSummaryStatistics = IntStream.range(1,100).summaryStatistics();
        System.out.println("Max: "+intSummaryStatistics.getMax());
        System.out.println("Min: "+intSummaryStatistics.getMin());
        System.out.println("Average: "+intSummaryStatistics.getAverage());
        System.out.println("Sum: "+intSummaryStatistics.getSum());
        System.out.println("Count: "+intSummaryStatistics.getCount());
        System.out.println("toString(): "+intSummaryStatistics.toString());

        /* we will get IntSummaryStatistics,LongSummaryStatistics,Double SummaryStatistics from Stream of elements by calling static methods
        of Collectors class are summarizingInt(),summarizingLong() & summarizingDouble respectively in collect() method
        */

        List<Student> studentList = Student.getStudents();
        System.out.println("IntSummaryStatistics "+studentList.stream().collect(Collectors.summarizingInt(s->s.getId())));
        System.out.println("LongSummaryStatistics "+studentList.stream().collect(Collectors.summarizingLong(s->s.getId())));
        System.out.println("DoubleSummaryStatistics "+studentList.stream().collect(Collectors.summarizingDouble(s->s.getId())));
    }
}
