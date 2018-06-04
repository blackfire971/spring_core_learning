package com.example.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by saml on 6/4/2018.
 */
public class MovieRecommender {
    @Autowired
    private MovieCatalog movieCatalog;
}
