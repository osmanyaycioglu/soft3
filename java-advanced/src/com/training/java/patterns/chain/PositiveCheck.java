package com.training.java.patterns.chain;


public class PositiveCheck extends AbstractProcess {

    public PositiveCheck(final AbstractProcess nextParam) {
        super(nextParam);
    }

    @Override
    boolean process(final int valueParam) {
        if (valueParam > 0) {
            System.out.println("pozitif");
            return true;
        }
        return false;
    }

}
