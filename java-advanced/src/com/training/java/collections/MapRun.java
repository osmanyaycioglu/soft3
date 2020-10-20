package com.training.java.collections;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.training.java.patterns.adaptor.Employee;

public class MapRun {

    public static void main(final String[] args) {
        Map<String, Employee> myMap = new ConcurrentHashMap<>(1_000_000,
                                                              0.9f,
                                                              1_000);

        myMap.put("osman1",
                  new Employee());

        Employee employee2Loc = myMap.get("osman1");

        Set<String> keySetLoc = myMap.keySet();
        for (String stringLoc : keySetLoc) {
            Employee employeeLoc = myMap.get(stringLoc);
        }

        Collection<Employee> valuesLoc = myMap.values();
        for (Employee employeeLoc : valuesLoc) {
            System.out.println(employeeLoc);
        }

        Set<Entry<String, Employee>> entrySetLoc = myMap.entrySet();
        for (Entry<String, Employee> entryLoc : entrySetLoc) {
            String keyLoc = entryLoc.getKey();
            Employee valueLoc = entryLoc.getValue();
        }

        Map<String, List<Employee>> myMap2 = new ConcurrentHashMap<>(1_000_000,
                                                                     0.9f,
                                                                     1_000);


    }
}
