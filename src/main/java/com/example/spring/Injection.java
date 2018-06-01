package com.example.spring;

/**
 * Created by saml on 5/11/2018.
 */
public class Injection {
    protected Injection() {
        System.err.println("Initializing Injection class...");
    }



    public void print() {
        System.err.println("printing in injection class");
    }
}
