package corejava.collections.comparing;

public class ComparableStudent implements  Comparable<ComparableStudent>{
  private int id;
  private String name;
  private String location;
  private int department;

    @Override
    public int compareTo(ComparableStudent o) {
        if(o.getId()<this.id)
            return -1;
        if(o.getId()>this.id)
            return 1;
        if(o.getId()==this.id)
            return 0;
        return 0;
    }

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", department=" + department +
                '}';
    }

    public ComparableStudent(int id, String name, String location, int department) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.department = department;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
