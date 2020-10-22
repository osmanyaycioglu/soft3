package com.training.ykb.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

//@Controller
//@Repository
//@Service
//@Configuration

public class Execution {

    @Autowired
    // @Qualifier("xyz")
    private IExecute exec;

    public void execute() {
        System.out.println(this.exec.execute("test"));
    }

}
