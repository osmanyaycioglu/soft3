package com.training.java.patterns.factory;

public class Main {

    public void doIt(final int index) {
        IProcess p = ProcessFactory.createProcess(index);
        // Poly
        String testLoc = p.test();
        if (testLoc.startsWith("OK")) {
            System.out.println("test OK");
        } else {
            System.out.println("test FAIL");
        }
        System.out.println("testLoc : " + testLoc);
        p.execute();
    }

    public static void main(final String[] args) {
        Main mainLoc = new Main();
        mainLoc.doIt(1);
    }
}
