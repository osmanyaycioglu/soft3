package com.training.java.patterns.state;


public class Run {

    public static void main(final String[] args) {
        RunStateMachine machineLoc = new RunStateMachine();
        machineLoc.start();
        machineLoc.kill();
        machineLoc.restart();
        machineLoc.kill();
        machineLoc.restart();
        machineLoc.start();
        System.out.println("Current state : " + machineLoc.getState());
    }
}
