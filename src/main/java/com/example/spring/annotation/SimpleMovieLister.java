package com.example.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by saml on 6/4/2018.
 */
//@Component
@Named
public class SimpleMovieLister {

    @Inject
    private MovieFinder movieFinder;

    @Inject
    private ApplicationContext applicationContext;

    @Inject
    public void setMovieFinder(@Nullable MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void print() {
        System.err.println("SimpleMovieLister print() method");
    }

    public MovieFinder getMovieFinder() {
        return this.movieFinder;
    }

    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }
}
