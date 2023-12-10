package corejava.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable{
    int id;
    String name;
    String loc;
    String phno;
    int salary;
    String designation;
    String organization;

    public Student(int id, String name, String loc, String phno, int salary, String designation, String organization) {
        this.id = id;
        this.name = name;
        this.loc = loc;
        this.phno = phno;
        this.salary = salary;
        this.designation = designation;
        this.organization = organization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                ", phno='" + phno + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

    public static List<Student> getStudents(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"Raghu","Hyd","983844548",10000,"se","Wipro"));
        list.add(new Student(2,"Ram","Bang","9838644548",20000,"mgr","cts"));
        list.add(new Student(3,"Jaya","Chen","983778844548",10000,"se","tcs"));
        list.add(new Student(4,"Priya","Delhi","98323844548",15000,"sse","capgemeni"));
        list.add(new Student(5,"RaghuRam","Pune","983873844548",1560000,"pl","infosys"));
        list.add(new Student(6,"veera","Hyd","983844548",100000,"se","Wipro"));
        list.add(new Student(7,"venky","Bang","9838644548",200000,"mgr","cts"));
        list.add(new Student(8,"seenu","Chen","983778844548",100000,"se","tcs"));
        list.add(new Student(9,"jagu","Delhi","98323844548",150000,"sse","capgemeni"));
        list.add(new Student(10,"vikas","Pune","983873844548",1450000,"pl","infosys"));
        return list;
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student) o;
        if(student.getId()>this.getId() )
         return 1;
        else
            return -1;
    }
}
