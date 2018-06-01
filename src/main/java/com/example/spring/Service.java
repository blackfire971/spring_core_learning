package com.example.spring;

/**
 * Created by saml on 5/14/2018.
 */
public class Service {
    public static Injection getInstance() {
        System.err.println("Invoke static factory method in Injection class");
        return new Injection();
    }
}
