package com.training.java.annotation;

@MyAnno("valueType")
public class AnnoUsage {

    @MyAnno(value = "field", xyz = "abc")
    private String name;


    @MyAnno("method")
    public void method1(final String str) {
        System.out.println(str);
    }


    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        this.name = nameParam;
    }


}
