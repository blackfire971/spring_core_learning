package com.example.spring.annotation;

import com.example.spring.annotation.qualifier.Format;
import com.example.spring.annotation.qualifier.MovieQualifier;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by saml on 6/4/2018.
 */
//@Component
@Named
public class MovieRecommender {

    @Resource
    @MovieQualifier(format = Format.BLUERAY, genre = "Comedy")
    private MovieCatalog movieCatalog;

    @Inject
    public void print(@Named("first") MovieCatalog catalog) {
        System.err.println("MovieRecommender print() method..." + catalog.getCatalog());
        System.err.println("MovieRecommender property value:" + movieCatalog.getCatalog());
    }

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

}
