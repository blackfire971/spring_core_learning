package com.example.spring.annotation.profile;

import com.example.spring.annotation.MovieFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
//@Production
@Profile("production")
public class ProdConfig {

    @Bean
    public MovieFinder movieFinder() {
        MovieFinder movieFinder = new MovieFinder();
        movieFinder.setUrl("production");
        movieFinder.setUsername("prod");
        movieFinder.setPassword("password");
        return movieFinder;
    }
}
