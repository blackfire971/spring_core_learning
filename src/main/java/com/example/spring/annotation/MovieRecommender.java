package com.example.spring.annotation;

import com.example.spring.annotation.qualifier.Format;
import com.example.spring.annotation.qualifier.MovieQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by saml on 6/4/2018.
 */
@Component
public class MovieRecommender {

    @Resource
    @MovieQualifier(format= Format.BLUERAY, genre = "Comedy")
    private MovieCatalog movieCatalog;

    @Autowired
    public void print(@MovieQualifier(format=Format.VHS, genre = "Action") MovieCatalog catalog) {
        System.err.println("MovieRecommender print() method..." + catalog.getCatalog());
        System.err.println("MovieRecommender property value:"+movieCatalog.getCatalog());
    }

    public MovieCatalog getMovieCatalog() {
        return movieCatalog;
    }

}
