package com.training.java.patterns.chain;


public class Run {

    public static void main(final String[] args) {
        IProcess prc = ProcessFactory.createProcessChain();
        prc.execute(0);
    }
}
