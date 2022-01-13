package serialization;

import java.io.Serializable;

public class Student implements Serializable{
    public int id;
    String name;
    transient int phone;

    public Student() {

    }
    public Student(int id, String name, int phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getPhone(int id) {
        return id == 1 ? 123 : 234;
    }
}
