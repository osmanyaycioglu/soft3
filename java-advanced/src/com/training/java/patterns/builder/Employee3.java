package com.training.java.patterns.builder;


public class Employee3 {

    private String name;
    private String surname;
    private int    age;

    public String getName() {
        return this.name;
    }

    public Employee3 name(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Employee3 surname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Employee3 age(final int ageParam) {
        this.age = ageParam;
        return this;
    }


}
