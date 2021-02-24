package test.comparator_comparable;

public class Student implements Comparable {
    private int id;
    private String name;

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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student studentOther = (Student) o;
//        return this.id - studentOther.id;
//        return this.name.compareTo(studentOther.name);
        int result = this.id - studentOther.id;
        if( result == 0){
            return this.name.compareTo(studentOther.name);
        }
        return result;
    }
}
