package com.training.ykb;

import org.springframework.boot.SpringApplication;

public class AppRun {

    public static void main(final String[] args) {
        SpringApplication.run(SoftSpringApplication.class,
                              args);

        MyBean beanLoc = new MyBean();
        MyUsingBean myUsingBeanLoc = new MyUsingBean();
        myUsingBeanLoc.setMyBean(beanLoc);

    }
}
