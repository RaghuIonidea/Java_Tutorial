package corejava.langpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CustomImmutable {
    private int id;
    private String name;

    private List<Student> list;

    @Override
    public String toString() {
        return "CustomImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public CustomImmutable(int id, String name, List<Student> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getList() {
        ArrayList<Student> arrlist =new ArrayList<>();
        for (Student s:list) {
            arrlist.add(s);
        }
        return arrlist;
    }

    public static void main(String[] args) {
        Student s=new Student(1,"Ram");
        Student s1=new Student(2,"Ramu");
        CustomImmutable customImmutable=new CustomImmutable(1,"Raghu", Arrays.asList(s,s1));
        System.out.println(customImmutable);
        //modify immutable class and see weather immutable class is modified or not.
        customImmutable.getList().add(new Student(3,"priya"));
        System.out.println(customImmutable.getList());
    }
}
