package design_patterns.prototype;

public class StudentClone implements Cloneable{
    public int id;
    public String name;

    @Override
    public String toString() {
        return "StudentClone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public StudentClone(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
