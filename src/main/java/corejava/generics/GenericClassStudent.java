package corejava.generics;

import corejava.langpackage.Student;

import java.io.Serializable;

public class GenericClassStudent<T extends Serializable> {
    //public class GenericStudent<T extends Runnable> if we replace this line with above line
    // then we will get compile time error at line 22,because Student class is not Implementing Runnable Interface

    T t; //we will pass student type at runtime
    GenericClassStudent(T t){
        this.t=t;
    }
    T getName()
    {
        return t;
    }

    public static void main(String[] args) {
        Student st=new Student(1,"Ramu");
        GenericClassStudent genericStudent=new GenericClassStudent(st);
        System.out.println("Generic Type we passed is "+genericStudent.t.getClass());

    }
}
