package com.training.java.patterns.state;


public class StoppedState implements IRunState {

    @Override
    public IRunState start() {
        return this;
    }

    @Override
    public IRunState kill() {
        return this;
    }

    @Override
    public IRunState restart() {
        System.out.println("System restarted.");
        return new BootingState();
    }

    @Override
    public ERunState getState() {
        return ERunState.STOPPED;
    }

}
