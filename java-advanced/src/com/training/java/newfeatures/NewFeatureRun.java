package com.training.java.newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import com.training.java.atm.Customer;

public class NewFeatureRun {

    public static void main(final String[] args) {
        IExecution m = new MyExecution();
        System.out.println(m.execute("osman"));

        final int value = 100;

        final Customer customerLoc = Customer.getBuilder()
                                             .name("osman")
                                             .surname("yaycıoğlu")
                                             .username("osmany")
                                             .password("123456" + "")
                                             .build();

        IExecution a = new IExecution() {

            @Override
            public String execute(final String strParam) {
                return "Anonim : " + strParam + " value : " + value + " " + customerLoc;
            }
        };

        System.out.println(a.execute("osman"));

        IExecution l = f -> {
            return "Lambda : " + f + " value : " + value + " " + customerLoc;
        };
        System.out.println(l.execute("osman"));

        IExecution l2 = f -> "Lambda 2 : " + f + " value : " + value + " " + customerLoc;
        System.out.println(l2.execute("osman"));

        IExecution l3 = NewFeatureRun::xyz;
        System.out.println(l3.execute("osman"));
        NewFeatureRun featureRunLoc = new NewFeatureRun();

        IExecution l4 = featureRunLoc::abc;
        System.out.println(l4.execute("osman"));


        System.out.println(NewFeatureRun.execute(o -> "Inner Lambda : " + o,
                                                 "osman"));

        System.out.println(NewFeatureRun.execute(o -> "Test : " + o.substring(2),
                                                 "osman"));

        IProcess pr = (word,
                       val1,
                       val2) -> Integer.parseInt(word) + val1 + val2;
        long processLoc = pr.process("1300",
                                     1000,
                                     5000L);

        System.out.println("Sonuç : " + processLoc);

        ITask task = () -> new Random().nextLong();

        long resultLoc = task.result();

        System.out.println("Task sonuç : " + resultLoc);

        List<String> asListLoc = Arrays.asList("abc",
                                               "xyz",
                                               "sdf",
                                               "osman",
                                               "ali");
        asListLoc.forEach(System.out::println);
        asListLoc.forEach(y -> System.out.println(y));

        for (String stringLoc : asListLoc) {
            System.out.println(stringLoc);
        }

        Predicate<String> strCheck = z -> z.startsWith("test");
        if (strCheck.test("test string")) {
            System.out.println("Test ile başlıyor");
        } else {
            System.out.println("Test ile başlamıyor");
        }
    }

    public static String xyz(final String str) {
        return "Lambda : " + str;
    }

    public String abc(final String str) {
        return "Lambda : " + str;
    }

    public static String execute(final IExecution el,
                                 final String str) {
        return el.execute(str);
    }

}

