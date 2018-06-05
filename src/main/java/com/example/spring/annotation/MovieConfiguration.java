package com.example.spring.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by saml on 6/4/2018.
 */
@Configuration
public class MovieConfiguration {

    @Bean
//    @Primary
    public MovieCatalog firstMovieCatalog() {
        return new MovieCatalog("first movie catalog");
    }

    @Primary
    @Bean
    @Qualifier("second")
    public MovieCatalog secondMovieCatalog() {

        return new MovieCatalog("second movie catalog");
    }

    @Bean
    @Qualifier("third")
    public MovieCatalog thirdMovieCatalog() {
        return new MovieCatalog("third movie catalog");
    }

}
