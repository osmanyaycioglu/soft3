package com.training.soft.dependency;

public class ExecImpl1 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "exec 1 : " + strParam;
    }

}
