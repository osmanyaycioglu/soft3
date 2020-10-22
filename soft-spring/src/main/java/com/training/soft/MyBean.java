package com.training.soft;

import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class MyBean {

    private String strValue;
    private int    intValue;

    public String getStrValue() {
        return this.strValue;
    }

    public void setStrValue(final String strValueParam) {
        this.strValue = strValueParam;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public void setIntValue(final int intValueParam) {
        this.intValue = intValueParam;
    }


}
