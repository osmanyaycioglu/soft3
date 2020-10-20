package com.training.java.patterns.chain;


public class FiftyCheck extends AbstractProcess {

    public FiftyCheck(final AbstractProcess nextParam) {
        super(nextParam);
    }

    @Override
    boolean process(final int valueParam) {
        if (valueParam < 50) {
            System.out.println("50 den küçük");
            return true;
        }
        return false;
    }

}
