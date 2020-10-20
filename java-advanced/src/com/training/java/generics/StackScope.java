package com.training.java.generics;

import com.training.java.patterns.builder.Employee;

public class StackScope {

    public void method1() {
        int iVal = 100;

        Integer intVal = new Integer(100);
        Integer intVal2 = 200;
        intVal = null;

        LongValue abc = new LongValue();
        LongValue xyz = new LongValue();
        LongValue longValueLoc = new LongValue();
        LongValue j = longValueLoc;
        String stringLoc = "osman";
        this.method2();
    }

    public void method2() {
        long ll = 2000;
        Employee employeeLoc = Employee.getBuilder()
                                       .name("osman")
                                       .surname("yay")
                                       .age(50)
                                       .build();
    }

    public static void main(final String[] args) {
        StackScope scopeLoc = new StackScope();
        scopeLoc.method1();
    }
}
