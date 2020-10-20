package com.training.java.patterns.builder;


public class Employee2 {

    private final String name;
    private final String surname;
    private final int    age;

    public Employee2(final String surnameParam,
                     final String nameParam,
                     final int ageParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.age = ageParam;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }


}
