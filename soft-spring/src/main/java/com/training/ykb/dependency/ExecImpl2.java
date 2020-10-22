package com.training.ykb.dependency;

//@Component
//@Qualifier("xyz")
public class ExecImpl2 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "exec 2 : " + strParam;
    }

}
