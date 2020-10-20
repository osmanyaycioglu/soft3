package com.training.java.patterns.factory;


public class ProcessFactory {

    public static final int PROCESS_V1 = 1;

    public static IProcess createProcess(final int index) {
        IProcess p = null;
        switch (index) {
            case PROCESS_V1:
                p = new ConcreteClass();
                break;
            case 2:
                p = new ConcreteClass2();
                break;
            case 3:
                p = new ConcreteClass3();
                break;
            case 4:
                p = new ConcreteClass3();
                break;
            default:
                p = new ConcreteClass3();
                break;
        }

        return p;
    }
}
