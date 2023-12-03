package corejava.generics;

import corejava.langpackage.Student;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenricMethodAndWildCardCharecter {

    public void add(ArrayList<?> list){
     list.add(null);
     //we can add only null values else compile time error, un-comment line 16 and see for error
     System.out.println(list);
     //list.add(new Student(1,"Ram"));
    }
    public void addToList(ArrayList<? extends Serializable> studentList){
        System.out.println("Student List:  "+studentList);
    }
    public static void main(String[] args) {
        GenricMethodAndWildCardCharecter gmwc=new GenricMethodAndWildCardCharecter();
        //gmwc.add(null);
        //if we un-comment above call we will get exception
        //Exception in thread "main" java.lang.NullPointerException:
        //                Cannot invoke "java.util.ArrayList.add(Object)" because "list" is null

        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student(1,"Rag"));
        students.add(new Student(2,"Ramu"));
        gmwc.addToList(students);

        ArrayList<Sample> sample= new ArrayList<>();
        sample.add(new Sample(1,"Rag"));
        sample.add(new Sample(2,"Ramu"));
        //gmwc.addToList(sample);
        // we can't call addToList method by passing list of Sample objects
        // because Sample class not implementing Serializable
        //we can call addToList method which accepts list of Objects which implements Serializable
    }

}
