package com.training.java.patterns.chain;


public class ZeroCheck extends AbstractProcess {

    public ZeroCheck(final AbstractProcess nextParam) {
        super(nextParam);
    }

    @Override
    boolean process(final int valueParam) {
        if (valueParam == 0) {
            System.out.println("sıfır");
            return true;
        }
        return false;
    }

}
