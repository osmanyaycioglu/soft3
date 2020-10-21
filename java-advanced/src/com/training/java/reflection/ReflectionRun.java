package com.training.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.training.java.patterns.adaptor.Employee;

public class ReflectionRun {

    public static void main(final String[] args) {
        Class<Employee> empClazz = Employee.class;
        Field[] declaredFieldsLoc = empClazz.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            System.out.println(fieldLoc.getName());
        }

        Method[] declaredMethodsLoc = empClazz.getDeclaredMethods();
        for (Method methodLoc : declaredMethodsLoc) {
            System.out.println("Method : " + methodLoc.getName());
            Parameter[] parametersLoc = methodLoc.getParameters();
            for (Parameter param : parametersLoc) {
                System.out.println("Method : "
                                   + methodLoc.getName()
                                   + " Param name : "
                                   + param.getName()
                                   + " Param type : "
                                   + param.getType());
            }
        }

        try {
            Employee newInstanceLoc = empClazz.newInstance();
            Method setMethodLoc = empClazz.getMethod("setName",
                                                     String.class);
            setMethodLoc.invoke(newInstanceLoc,
                                "osman");

            Field fieldLoc = empClazz.getDeclaredField("name");
            fieldLoc.setAccessible(true);
            fieldLoc.set(newInstanceLoc,
                         "ali");

            Method methodLoc = empClazz.getMethod("getName",
                                                  null);
            if (methodLoc != null) {
                Class<?> returnTypeLoc = methodLoc.getReturnType();
                if (String.class == returnTypeLoc) {
                    String invokeLoc = (String) methodLoc.invoke(newInstanceLoc,
                                                                 null);
                    System.out.println("getName : " + invokeLoc);
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}

