package com.training.java.patterns.chain;


public class Change {

    public static void main(final String[] args) {
        int index = 100;

        if (index < 0) {
            System.out.println("negatif");
        } else if (index == 0) {
            System.out.println("sıfır");
        } else if (index > 0) {
            System.out.println("pozitif");
        }
    }
}
