package com.training.java.calculator.dynamic;

import java.util.ArrayList;
import java.util.List;

public class CalculatorOperationFactory {

    public static List<ICommand<Integer, Integer, String>> getOperations() {
        List<ICommand<Integer, Integer, String>> opListLoc = new ArrayList<>();
        opListLoc.add(new Command<>(() -> "Toplama",
                                    (a,
                                     b) -> "" + (a + b)));
        opListLoc.add(new Command<>(() -> "Çıkarma",
                                    (a,
                                     b) -> "" + (a - b)));
        opListLoc.add(new Command<>(() -> "Çarpma",
                                    (a,
                                     b) -> "" + (a * b)));
        opListLoc.add(new Command<>(() -> "Bölme",
                                    (a,
                                     b) -> b == 0 ? "NAN" : ("" + (a / b))));
        opListLoc.add(new Command<>(() -> "Topla Çarp",
                                    (a,
                                     b) -> "" + ((a + b) + (a * b))));

        opListLoc.add(new Command<>(() -> "Mod",
                                    (a,
                                     b) -> ""
                                           + (Math.floorMod(a,
                                                            b))));

        return opListLoc;
    }


}
