package com.example.spring.annotation;

import com.example.spring.annotation.qualifier.Format;
import com.example.spring.annotation.qualifier.MovieQualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by saml on 6/4/2018.
 */
@Configuration
@ComponentScan(basePackages = "com.example.spring.annotation")
public class MovieConfiguration {

    @Bean
//    @Primary
//    @Scope("prototype")
    @Singleton
    @Named("first")
    public MovieCatalog firstMovieCatalog() {
        return new MovieCatalog("first movie catalog");
    }

    //    @Primary
    @Bean
    @MovieQualifier(format = Format.VHS, genre = "Action")
    @Singleton
    public MovieCatalog secondMovieCatalog() {
        return new MovieCatalog("second movie catalog");
    }

    @Bean
    @MovieQualifier(format = Format.BLUERAY, genre = "Comedy")
    public MovieCatalog thirdMovieCatalog() {
        return new MovieCatalog("third movie catalog");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}
