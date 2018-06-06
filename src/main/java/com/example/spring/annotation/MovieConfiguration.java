package com.example.spring.annotation;

import com.example.spring.annotation.qualifier.Format;
import com.example.spring.annotation.qualifier.MovieQualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

//    @Primary
    @Bean
    @MovieQualifier(format = Format.VHS, genre = "Action")
    public MovieCatalog secondMovieCatalog() {

        return new MovieCatalog("second movie catalog");
    }

    @Bean
    @MovieQualifier(format = Format.BLUERAY, genre = "Comedy")
    public MovieCatalog thirdMovieCatalog() {
        return new MovieCatalog("third movie catalog");
    }

}
