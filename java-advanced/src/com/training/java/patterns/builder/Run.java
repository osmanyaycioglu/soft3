package com.training.java.patterns.builder;


public class Run {

    public static void main(final String[] args) {
        Employee employeeLoc = Employee.getBuilder()
                                       .age(50)
                                       .name("osman")
                                       .surname("yay")
                                       .build();

        Employee2 employee2Loc = new Employee2("osman",
                                               "yay",
                                               50);

        Employee3 employee3 = new Employee3().name("osman")
                                             .surname("yay")
                                             .age(50);
    }
}
