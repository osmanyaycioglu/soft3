package com.training.java.patterns.state;


public class RunStateMachine implements IRunState {

    private IRunState runState = new BootingState();

    @Override
    public IRunState start() {
        this.runState = this.runState.start();
        return this.runState;
    }

    @Override
    public IRunState kill() {
        this.runState = this.runState.kill();
        return this.runState;

    }

    @Override
    public IRunState restart() {
        this.runState = this.runState.restart();
        return this.runState;

    }

    @Override
    public ERunState getState() {
        return this.runState.getState();
    }

}
