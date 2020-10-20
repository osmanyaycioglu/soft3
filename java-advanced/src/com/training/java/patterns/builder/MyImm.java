package com.training.java.patterns.builder;


public class MyImm {

    private final String name;
    private final String surname;

    public MyImm(final String nameParam,
                 final String surnameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
    }


    public String getName() {
        return this.name;
    }


    public String getSurname() {
        return this.surname;
    }


}
