package com.bridgelabz.javaReflection.basicProblems;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InputClassName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a class name in proper format: ");
        String className = scn.next();

        try{
            Class<?> cls1 = Class.forName(className);

            System.out.println("Class name is: " + cls1.getName());

            System.out.println("-------------Constructors----------------");
            Constructor<?>[] con1 = cls1.getConstructors();
            for (Constructor<?> c: con1){
                System.out.println(c);
            }

            System.out.println("----------Methods------------");
            Method[] method = cls1.getMethods();
            for (Method m: method){
                System.out.println(m);
            }

            System.out.println("---------Fields----------");

            Field[] field = cls1.getFields();
            for (Field f:field){
                System.out.println(f);
            }
        }catch (Exception e){
            System.out.println("Enter a valid class name.");
        }

    }
}
