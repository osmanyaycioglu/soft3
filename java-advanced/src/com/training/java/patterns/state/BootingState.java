package com.training.java.patterns.state;


public class BootingState implements IRunState {

    @Override
    public IRunState start() {
        System.out.println("Booting finished and starting");
        return new StartedState();
    }

    @Override
    public IRunState kill() {
        System.out.println("System killed.");
        return new StoppedState();
    }

    @Override
    public IRunState restart() {
        return this;
    }

    @Override
    public ERunState getState() {
        return ERunState.BOOTING;
    }

}
