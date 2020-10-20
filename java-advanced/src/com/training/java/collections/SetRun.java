package com.training.java.collections;

import java.util.HashSet;
import java.util.Set;

import com.training.java.patterns.adaptor.Employee;

public class SetRun {

    public static void main(final String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("1");
        mySet.add("1");
        mySet.add("2");
        mySet.add("2");
        mySet.add("3");
        mySet.add("3");
        mySet.add("4");
        mySet.add("4");

        for (String stringLoc : mySet) {
            System.out.println(stringLoc);
        }
        System.out.println("*------------------------*");
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("3");
        mySet2.add("4");
        mySet2.add("5");
        mySet2.add("6");
        mySet2.add("7");

        mySet.removeAll(mySet2);

        for (String stringLoc : mySet) {
            System.out.println(stringLoc);
        }


        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            mySet.add("" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            mySet.contains("" + iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));


        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            mySet.remove("" + iLoc);
        }
        System.out.println("remove Delta : " + (System.currentTimeMillis() - delta));


        Set<Employee> empSet = new HashSet<>();

    }
}
