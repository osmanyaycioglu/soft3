package com.training.java.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool extends Thread {

    public static BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(5_000);

    @Override
    public void run() {
        while (true) {
            try {
                Runnable takeLoc = ThreadPool.queue.take();
                takeLoc.run();
            } catch (Exception eLoc) {
                eLoc.printStackTrace();
            }
        }
    }
}
