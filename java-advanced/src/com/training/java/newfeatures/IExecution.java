package com.training.java.newfeatures;

@FunctionalInterface
public interface IExecution {

    String execute(String str);

    default String execDefault() {
        String executeLoc = this.execute("default");
        System.out.println("execDefault executed");
        return executeLoc;
    }
}
