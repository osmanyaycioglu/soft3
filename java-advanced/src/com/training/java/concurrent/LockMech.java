package com.training.java.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockMech {

    public static void main(final String[] args) {
        Object obj = new Object();
        synchronized (obj) {

        }


        ReentrantLock lockLoc = new ReentrantLock();

        try {
            lockLoc.lock();
            lockLoc.tryLock(1_000,
                            TimeUnit.MILLISECONDS);

        } catch (Exception eLoc) {

        } finally {
            lockLoc.unlock();
        }

        ReentrantReadWriteLock readWriteLockLoc = new ReentrantReadWriteLock();
        readWriteLockLoc.readLock()
                        .lock();
        readWriteLockLoc.writeLock()
                        .lock();
    }
}
