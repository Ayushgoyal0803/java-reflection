package com.bridgelabz.javaReflection.basicProblems;

import java.lang.reflect.Constructor;

class Student{
    private String name;

    Student(String name){
        this.name = name;
    }

    void getName(){
        System.out.println(name);
    }

}

public class CreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;

        Constructor<?> cons = cls.getDeclaredConstructor(String.class);
        Student student = (Student) cons.newInstance("Ayush");

        student.getName();

    }
}
