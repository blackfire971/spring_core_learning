package com.example.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by saml on 6/4/2018.
 */
public class MovieCatalog {
    private String catalog;

    public MovieCatalog(String catalog) {
        this.catalog = catalog;
    }
    public void print() {
        System.err.println("MovieCatalog print() method..." + catalog);
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getCatalog() {
        return catalog;
    }

    @PostConstruct
    public void printAfterConstruct() {
        System.err.println("MovieCatalog printAfterConstruct() method...");
    }

    @PreDestroy
    public void printBeforeDestroy() {

        System.err.println("MovieCatalog printBeforeDestroy() method...");
    }
}
