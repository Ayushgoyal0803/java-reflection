package com.bridgelabz.javaReflection.basicProblems;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

class Calculator{
    private int multiply(int a, int b){
        return a*b;
    }
}

public class AccessMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Class<?> cls = calculator.getClass();

        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);

        int res = (int) method.invoke(calculator,5,6);
        System.out.println(res);
    }
}
