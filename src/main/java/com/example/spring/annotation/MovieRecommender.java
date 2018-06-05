package com.example.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by saml on 6/4/2018.
 */
@Component
public class MovieRecommender {

    @Autowired
    @Qualifier("third")
    private MovieCatalog movieCatalog;

    public void print(@Qualifier("second")MovieCatalog catalog) {
        System.err.println("MovieRecommender print() method..." + catalog.getCatalog());
        System.err.println("MovieRecommender property value:"+movieCatalog.getCatalog());
    }

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

}
