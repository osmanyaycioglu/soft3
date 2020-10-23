package com.training.java.concurrent;


public class MyRunable implements Runnable {

    @Override
    public void run() {
        MyThread.increase();
    }

}
