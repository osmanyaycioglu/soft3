package com.training.java.concurrent;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    public static long           counter       = 0;
    private final CountDownLatch downLatch;

    private long                 localCcounter = 0;

    public MyThread(final CountDownLatch downLatchParam) {
        this.downLatch = downLatchParam;
    }

    public static synchronized void increase() {
        MyThread.counter++;
    }

    @Override
    public void run() {
        while (true) {
            if (interrupted()) {
                return;
            }
            try {
                for (int iLoc = 0; iLoc < 100_000_000; iLoc++) {
                    // this.localCcounter++;
                    increase();
                }
                this.downLatch.countDown();
                return;
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }

    public long getLocalCcounter() {
        return this.localCcounter;
    }

    public void setLocalCcounter(final long localCcounterParam) {
        this.localCcounter = localCcounterParam;
    }


}
