package com.training.java.patterns.chain;


public class NegativeCheck extends AbstractProcess {

    public NegativeCheck(final AbstractProcess nextParam) {
        super(nextParam);
    }

    @Override
    boolean process(final int valueParam) {
        if (valueParam < 0) {
            System.out.println("negatif");
            return true;
        }
        return false;
    }

}
