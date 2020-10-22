package com.training.soft.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DependencyRun implements CommandLineRunner {

    @Autowired
    private Execution ex;

    @Override
    public void run(final String... argsParam) throws Exception {
        this.ex.execute();
    }

}
