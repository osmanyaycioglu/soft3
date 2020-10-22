package com.training.ykb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyUsingBean {

    private String name;

    // Field Wiring
    @Autowired
    private MyBean myBean;

    private MyBean myBean2;

    private MyBean myBean3;


    // Constructor Wiring
    @Autowired
    public MyUsingBean(final MyBean myBean) {
        this.myBean2 = myBean;
    }

    public MyUsingBean() {
    }

    @PostConstruct
    public void init() {
        this.myBean.getIntValue();
    }

    @PreDestroy
    public void destroy() {
    }

    // Method Wiring
    @Autowired
    public void putBean(final MyBean myBean) {
        this.myBean3 = myBean;
    }

    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public MyBean getMyBean() {
        return this.myBean;
    }


    public void setMyBean(final MyBean myBeanParam) {
        this.myBean = myBeanParam;
    }


}
