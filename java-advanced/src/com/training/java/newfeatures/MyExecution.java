package com.training.java.newfeatures;


public class MyExecution implements IExecution {

    @Override
    public String execute(final String strParam) {
        return "MyExecution : " + strParam;
    }

}
