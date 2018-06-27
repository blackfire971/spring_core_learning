package com.example.spring.annotation;


import org.springframework.stereotype.Component;

/**
 * Created by saml on 6/4/2018.
 */
@Component
//@Named
public class MovieFinder {

    private String url;
    private String username;
    private String password;

    public void print() {
        System.err.println("url: "+ url +", username: "+username+", password: "+password);
    }

    public MovieFinder() {
    }

//    @Bean(name = {"url","username", "password"}, value = {""})
    public MovieFinder(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
//        System.err.println("url: " + url + " username:" + username + " password:" + password);
//        return new MovieFinder();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
