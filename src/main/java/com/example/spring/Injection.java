package com.example.spring;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by saml on 5/11/2018.
 */
public class Injection implements InitializingBean {
    protected String name = "injection name";

    protected Injection() {
        System.err.println("Initializing Injection class...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("Run afterPropertiesSet method in Injection class");
    }

    public void init() {
        System.err.println("Run init method in Injection class");
    }
//    public void print() {
//        System.err.println("printing in injection class");
//    }
}
