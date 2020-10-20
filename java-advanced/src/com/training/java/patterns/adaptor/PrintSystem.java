package com.training.java.patterns.adaptor;


public class PrintSystem {

    public void print(final Employee emp) {
        System.out.println(" Sayın : " + emp.getName() + " " + emp.getSurname());
    }

}
