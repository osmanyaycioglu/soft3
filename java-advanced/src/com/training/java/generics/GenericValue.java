package com.training.java.generics;


public class GenericValue<T extends Comparable<T>> {

    private T      value;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public T getValue() {
        return this.value;
    }


    public void setValue(final T valueParam) {
        this.value = valueParam;
    }

}
