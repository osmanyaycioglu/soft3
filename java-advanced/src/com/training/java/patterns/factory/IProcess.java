package com.training.java.patterns.factory;


public interface IProcess {

    public final static int test1 = 100;

    String execute();

    String test();


    public static void staticExecute() {
        System.out.println("static metod");
    }


    default String executeMe() {
        System.out.println("executeMe çalıştırıldı");
        return this.execute();
    }

}
