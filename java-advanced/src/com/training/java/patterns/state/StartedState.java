package com.training.java.patterns.state;


public class StartedState implements IRunState {

    @Override
    public IRunState start() {
        return this;
    }

    @Override
    public IRunState kill() {
        System.out.println("System killed.");
        return new StoppedState();
    }

    @Override
    public IRunState restart() {
        System.out.println("System restarted.");
        return new BootingState();

    }

    @Override
    public ERunState getState() {
        return ERunState.STARTED;
    }

}
