package com.training.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.java.atm.Account;
import com.training.java.atm.Customer;

public class StreamRun {

    public static void main(final String[] args) {
        List<String> asListLoc = Arrays.asList("4",
                                               "6",
                                               "6",
                                               "1",
                                               "2",
                                               "3",
                                               "5",
                                               "1",
                                               "2",
                                               "7");

        asListLoc.stream()
                 .sorted()
                 .distinct()
                 .peek(r -> System.out.println("Peek : " + r))
                 .limit(20)
                 .filter(e -> Integer.parseInt(e) > 3)
                 .filter(e -> Integer.parseInt(e) < 100)
                 .map(y -> Customer.getBuilder()
                                   .name(y)
                                   .build())
                 .filter(i -> i.getName()
                               .length() < 3)
                 .mapToLong(f -> f.getName()
                                  .length())
                 .summaryStatistics();

        System.out.println("-------------------------------");
        asListLoc.stream()
                 .sorted()
                 .distinct()
                 .peek(r -> System.out.println("Peek : " + r))
                 .limit(20)
                 .filter(e -> Integer.parseInt(e) > 3)
                 .filter(e -> Integer.parseInt(e) < 100)
                 .map(y -> Customer.getBuilder()
                                   .name(y)
                                   .build())
                 .filter(i -> i.getName()
                               .length() < 3)
                 .collect(Collectors.toList())
                 .forEach(System.out::println);
        System.out.println("-------------------------------");
        Map<String, List<Account>> collectLoc = asListLoc.stream()
                                                         .sorted()
                                                         .distinct()
                                                         .peek(r -> System.out.println("Peek : " + r))
                                                         .limit(20)
                                                         .filter(e -> Integer.parseInt(e) > 3)
                                                         .filter(e -> Integer.parseInt(e) < 100)
                                                         .map(y -> Customer.getBuilder()
                                                                           .name(y)
                                                                           .build())
                                                         .filter(i -> i.getName()
                                                                       .length() < 3)
                                                         .collect(Collectors.toMap(c -> c.getName(),
                                                                                   c -> c.getAccountList()));
        System.out.println("-------------------------------");
        asListLoc.stream()
                 .sorted()
                 .distinct()
                 .peek(r -> System.out.println("Peek : " + r))
                 .limit(20)
                 .filter(e -> Integer.parseInt(e) > 3)
                 .filter(e -> Integer.parseInt(e) < 100)
                 .map(y -> Customer.getBuilder()
                                   .name(y)
                                   .build())
                 .filter(i -> i.getName()
                               .length() < 3)
                 .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("-------------------------------");
        asListLoc.stream()
                 .sorted()
                 .distinct()
                 .peek(r -> System.out.println("Peek : " + r))
                 .limit(20)
                 .filter(e -> Integer.parseInt(e) > 3)
                 .filter(e -> Integer.parseInt(e) < 100)
                 .map(y -> Customer.getBuilder()
                                   .name(y)
                                   .build())
                 .filter(i -> i.getName()
                               .length() < 3)
                 .map(c -> Integer.parseInt(c.getName()))
                 .reduce(10,
                         (t,
                          d) -> t + d);
        System.out.println("-------------------------------");
        Integer reduceLoc = asListLoc.stream()
                                     .sorted()
                                     .distinct()
                                     .peek(r -> System.out.println("Peek : " + r))
                                     .limit(20)
                                     .filter(e -> Integer.parseInt(e) > 3)
                                     .filter(e -> Integer.parseInt(e) < 100)
                                     .map(y -> Customer.getBuilder()
                                                       .name(y)
                                                       .build())
                                     .filter(i -> i.getName()
                                                   .length() < 3)
                                     .<Integer> reduce(10,
                                                       (t,
                                                        c) -> t + Integer.parseInt(c.getName()),
                                                       (t1,
                                                        t2) -> t1 + t2);
        // .forEach(System.out::println);
    }
}
