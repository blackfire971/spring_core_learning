package com.example.spring.annotation.profile;

import com.example.spring.annotation.MovieFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Development
@Profile("default")

public class DefaultConfig {

    @Bean
    public MovieFinder movieFinder() {
        return new MovieFinder("default", "default", "123456");
    }
}
