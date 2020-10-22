package com.training.soft;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class AppRun {

    public static void main(final String[] args) {
        ConfigurableApplicationContext runLoc = SpringApplication.run(SoftSpringApplication.class,
                                                                      args);

        MyBean beanLoc = runLoc.getBean(MyBean.class);
    }
}
