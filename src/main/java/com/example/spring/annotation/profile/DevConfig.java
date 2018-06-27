package com.example.spring.annotation.profile;

import com.example.spring.annotation.MovieFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Development
@Profile("development")
public class DevConfig {

    @Bean
    public MovieFinder movieFinder() {
        return new MovieFinder("dev", "dev", "123456");
    }
}
