package reflection;

import serialization.Student;

import java.lang.reflect.Field;

public class SetFieldValue {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("serialization.Student");
            for(Field f : c.getDeclaredFields()) {
                System.out.println("Field " + f.toString() + " is of type: " + f.getType());
            }

            Student student = new Student();
            Field f = c.getField("id");
            System.out.println("Student's Id is: " + student.id + " before setting up value");
            f.setInt(student, 10);
            System.out.println("Student's Id is: " + student.id + " after setting up value");

        } catch(Throwable t) {
            t.printStackTrace();
        }

    }
}
