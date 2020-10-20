package com.training.java.patterns.adaptor;


public class PrintSystemProxy extends PrintSystem {

    @Override
    public void print(final Employee emp) {
        if (emp.getName() == null) {
            System.out.println("Isim null olamaz");
            return;
        }
        System.out.println("Print Proxy start");
        super.print(emp);
        System.out.println("Print Proxy end");
    }

}
