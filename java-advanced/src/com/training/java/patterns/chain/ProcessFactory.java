package com.training.java.patterns.chain;


public class ProcessFactory {

    public static IProcess createProcessChain() {
        return new PositiveCheck(new NegativeCheck(new ZeroCheck(null)));
    }
}
