package com.example.spring.annotation;

/**
 * Created by saml on 6/4/2018.
 */
public class MovieCatalog {
    private String catalog;

    public void print() {
        System.err.println("MovieCatalog print() method..." + catalog);
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
}
