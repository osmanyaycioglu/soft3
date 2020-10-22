package com.training.ykb.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyConfig {

    @Autowired
    private Environment env;

    //    @Value("${impl.type}")
    //    private int         implType;

    @Bean
    public IExecute createExecute(@Value("${impl.type}") final int implType) {
        //        String propertyLoc = this.env.getProperty("impl.type");
        //        switch (Integer.parseInt(propertyLoc)) {
        switch (implType) {
            case 1:
                return new ExecImpl1();
            case 2:
                return new ExecImpl2();

            default:
                return new ExecImpl1();
        }
    }
}
