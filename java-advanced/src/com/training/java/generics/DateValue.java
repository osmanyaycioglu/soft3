package com.training.java.generics;

import java.util.Date;

public class DateValue {

    private Date   value;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public Date getValue() {
        return this.value;
    }


    public void setValue(final Date valueParam) {
        this.value = valueParam;
    }


}
