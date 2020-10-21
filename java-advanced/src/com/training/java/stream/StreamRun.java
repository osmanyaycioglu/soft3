package com.training.java.stream;

import java.util.Arrays;
import java.util.List;

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
                 .filter(e -> Integer.parseInt(e) > 3)
                 .filter(e -> Integer.parseInt(e) < 100)
                 .distinct()
                 .forEach(System.out::println);
    }
}
