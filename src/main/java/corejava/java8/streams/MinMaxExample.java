package corejava.java8.streams;

import java.util.Comparator;
import java.util.List;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Student> studentList = Student.getStudents();
        System.out.println("Minimum based on ID:  "+studentList.stream().min((s1,s2)-> s1.compareTo(s2)));
        System.out.println("Maximum based on ID:  "+studentList.stream().max((s1,s2)-> s1.compareTo(s2)));
        System.out.println("-----------------------------------------");
        Comparator<Student> salry=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getSalary()>o2.getSalary())
                    return 1;
                else
                    return -1;
            }
        };
        System.out.println("Minimum based on Salary:  "+studentList.stream().min(salry));
        System.out.println("Maximum based on salary:  "+studentList.stream().max(salry));
    }
}
