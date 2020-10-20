package com.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListRun {

    public static void main(final String[] args) {
        List<String> strListLoc = new ArrayList<>();
        strListLoc.add("osman3");
        strListLoc.add("osman2");
        strListLoc.add("osman1");
        strListLoc.add("osman4");

        // thread safe
        List<String> synchronizedListLoc = Collections.synchronizedList(strListLoc);

        // Sort
        Collections.sort(strListLoc);
        for (String stringLoc : synchronizedListLoc) {
            System.out.println(stringLoc);
        }

        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            // String stringLoc = "osman" + iLoc;
            strListLoc.add("osman" + iLoc);

        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strListLoc.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            strListLoc.contains("osman" + iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            strListLoc.remove(0);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

        strListLoc.get(3);

        // strListLoc.remove(2);

        //        for (String stringLoc : strListLoc) {
        //            System.out.println(stringLoc);
        //        }

    }
}
