package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethodsAndFields {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.lang.String");

            System.out.println("----Methods----");
            for(Method method : c.getDeclaredMethods()) {
                System.out.println("Method: " + method.toString());
                System.out.println("Return type: " + method.getReturnType());
                for(Class params : method.getParameterTypes()) {
                    System.out.println("Param# " + params.toString());
                }
                for(Class exceptions : method.getExceptionTypes()) {
                    System.out.println("Exception# " + exceptions.toString());
                }
                System.out.println("------");
            }

            System.out.println("----Fields----");
            for(Field field : c.getDeclaredFields()) {
                System.out.println("Field: " + field.toString());
                System.out.println("Type# " + field.getType());
                System.out.println("Modifier# " + Modifier.toString(field.getModifiers()));
                System.out.println("------");
            }
        } catch(Throwable t) {
            t.printStackTrace();
        }

    }
}
