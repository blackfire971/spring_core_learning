package com.example.spring.annotation;

import javax.inject.Named;

/**
 * Created by saml on 6/4/2018.
 */
//@Component
@Named
public class MovieFinder {

    public void print() {
        System.err.println("MovieFinder print() method...");
    }
}
