package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableOutputStream {

    public static void main(String[] args) {

        try {
            Student s = new Student(1, "Poonam",123);
            FileOutputStream fileOutputStream = new FileOutputStream("t.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s);
            objectOutputStream.flush();
            objectOutputStream.close();

            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
