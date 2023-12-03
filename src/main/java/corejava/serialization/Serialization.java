package corejava.serialization;

import java.io.*;

public class Serialization implements Serializable {

     final transient int id =101;
     String name;

     transient int salary;

      static transient String location ="hyd";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Serialization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location=" + location +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialization s =new Serialization();
        s.setName("Raghu"); s.setSalary(1000);
        FileOutputStream fos = new FileOutputStream("D:/Notes/Serialization.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        FileInputStream fis=new FileInputStream("D:/Notes/Serialization.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Serialization d2=(Serialization)ois.readObject();
        System.out.println(d2);
    }
}
