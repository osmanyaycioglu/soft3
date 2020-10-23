package com.training.soft.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

// @Component
public class ATMCommandRunner implements CommandLineRunner {

    @Autowired
    private ATMRun aRun;

    @Override
    public void run(final String... argsParam) throws Exception {
        this.aRun.run();
    }

}
