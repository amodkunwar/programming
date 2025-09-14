package com.programming.JVM;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student {

    private String name;

    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();
        Class<?> aClass = student.getClass();

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method m : declaredMethods) {
            System.out.println(m);
        }

        Field[] fields = aClass.getDeclaredFields();

        for (Field f : fields) {
            System.out.println(f);
        }


    }
}
