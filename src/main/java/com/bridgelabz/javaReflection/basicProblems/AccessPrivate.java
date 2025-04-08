package com.bridgelabz.javaReflection.basicProblems;

import java.lang.reflect.Field;

class Person{
    private String name = "Ayush"  ;
}

public class AccessPrivate {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> cls = person.getClass();

        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);

        System.out.println("Old value: " + field.get(person) );

        field.set(person,"Ayush Goyal");

        System.out.println("New value: " + field.get(person));


    }
}
