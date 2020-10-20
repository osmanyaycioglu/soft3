package com.training.java.generics;

import com.training.java.patterns.adaptor.Employee;

public class GenericRun {

    public static <K> K test(final K k) {
        return k;
    }

    public static <K> void test2(final K k) {
        System.out.println(k);
    }


    public static void main(final String[] args) {
        LongValue longValueLoc = new LongValue();
        longValueLoc.setName("myval");
        longValueLoc.setValue(1000L);
        Long valueLoc = longValueLoc.getValue();

        ObjectValue objectValueLoc = new ObjectValue();
        objectValueLoc.setName("mygenericval");
        objectValueLoc.setValue(1000L);
        String str = (String) objectValueLoc.getValue();

        GenericValue<Long> lVal = new GenericValue<>();
        lVal.setName("genLong");
        lVal.setValue(600L);
        Long value2Loc = lVal.getValue();

        GenericValue<Employee> genericValueLoc = new GenericValue<>();
        genericValueLoc.setName("empVal");
        genericValueLoc.setValue(new Employee());
        Employee value3Loc = genericValueLoc.getValue();

        String mVal = test("osman");
        Long mVal2 = test(1000L);

        GenericValue<?> lVal2 = new GenericValue<String>();


        test2("so");
        test2(1000);


    }
}
