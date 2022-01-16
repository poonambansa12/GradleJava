package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {
    int id;
    String name;
    int phone;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeInt(phone);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        phone = in.readInt();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

}
