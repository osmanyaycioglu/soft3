package com.training.java.patterns.state;


public interface IRunState {

    IRunState start();

    IRunState kill();

    IRunState restart();

    ERunState getState();
}
