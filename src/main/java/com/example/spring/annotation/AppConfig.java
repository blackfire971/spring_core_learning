package com.example.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by saml on 6/20/2018.
 */
@Configuration
@ImportResource("classpath:properties-config.xml")
public class AppConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Bean
    public MovieFinder movieFinder() {
        return MovieFinder.getMovieFinder(url, username, password);
    }
}
