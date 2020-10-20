package com.training.java.patterns.adaptor;


public class CalisanEmployeeAdaptor extends Employee {

    private final Calisan cls;


    public CalisanEmployeeAdaptor(final Calisan clsParam) {
        this.cls = clsParam;
    }

    @Override
    public String getName() {
        return this.cls.getIsim();
    }

    @Override
    public String getSurname() {
        return this.cls.getSoyisim();
    }
}
