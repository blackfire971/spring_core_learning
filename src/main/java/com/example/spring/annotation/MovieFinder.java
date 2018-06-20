package com.example.spring.annotation;

/**
 * Created by saml on 6/4/2018.
 */
//@Component
//@Named
public class MovieFinder {

    public void print() {
        System.err.println("MovieFinder print() method...");
    }

    public static MovieFinder getMovieFinder(String url, String username, String password) {
        System.err.println("url: " + url + " username:" + username + " password:" + password);
        return new MovieFinder();
    }
}
