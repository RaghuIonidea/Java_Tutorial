package design_patterns.prototype;

public class PrototypeUtil {
    public static void main(String[] args) throws CloneNotSupportedException {
        StudentClone studentClone=new StudentClone(1,"Raghu");
        StudentClone studentClone1= (StudentClone) studentClone.clone();

        System.out.println("Hash codes are different");
        System.out.println(studentClone.hashCode());
        System.out.println(studentClone1.hashCode());

        System.out.println("Before making the changes in cloned copy");
        System.out.println("studentClone: "+studentClone);
        System.out.println("studentClone1:  "+studentClone1);

        System.out.println("after making the changes in cloned copy");
        studentClone1.setId(2);
        studentClone1.setName("Ram");
        System.out.println("studentClone: "+studentClone);
        System.out.println("studentClone1:  "+studentClone1);
    }
}
