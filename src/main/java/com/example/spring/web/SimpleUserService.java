package com.example.spring.web;

/**
 * Created by saml on 5/16/2018.
 */
public class SimpleUserService {
    Preferences userPref;

    public Preferences getUserPref() {
        return userPref;
    }

    public void setUserPref(Preferences userPref) {
        this.userPref = userPref;
    }
}
