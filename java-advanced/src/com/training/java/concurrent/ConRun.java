package com.training.java.concurrent;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConRun {

    public static void main(final String[] args) throws InterruptedException {
        CountDownLatch downLatchLoc = new CountDownLatch(10);
        List<MyThread> listLoc = new ArrayList<>();
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            MyThread myThreadLoc = new MyThread(downLatchLoc);
            listLoc.add(myThreadLoc);
            myThreadLoc.start();
        }

        //        try {
        //            Thread.sleep(5000);
        //        } catch (Exception eLoc) {
        //        }
        downLatchLoc.await();
        long total = 0;
        for (MyThread myThreadLoc : listLoc) {
            total += myThreadLoc.getLocalCcounter();
        }
        System.out.println("Counter : " + total);
        System.out.println("Counter : " + MyThread.counter);

        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(10);

        for (int iLoc = 0; iLoc < 1_000_000_000; iLoc++) {
            newFixedThreadPoolLoc.execute(new MyRunable());
        }

        BlockingQueue<String> strQuerue = new ArrayBlockingQueue<>(5_000);
        strQuerue.add("osman");
        String pollLoc = strQuerue.take();

        Deque<String> dequeLoc = new ArrayDeque<String>();

    }
}

