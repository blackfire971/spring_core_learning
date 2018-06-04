package com.example.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

/**
 * Created by saml on 6/4/2018.
 */
public class SimpleMovieLister {

//    @Autowired(required = false)
    private MovieFinder movieFinder;


    @Autowired
    public void setMovieFinder(@Nullable MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void print() {
        System.err.println("SimpleMovieLister print() method");
    }

    public MovieFinder getMovieFinder() {
        return this.movieFinder;
    }
}
