package com.example.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by saml on 6/20/2018.
 */
@Configuration
//@ImportResource("classpath:properties-config.xml")
@PropertySource("classpath:jdbc.properties")
public class AppConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Autowired
    Environment environment;


    @Bean
    public MovieFinder movieFinder() {
        System.err.println("From properties file: " + environment.getProperty("jdbc.url"));
        System.err.println("java home: " +environment.getProperty("JAVA_HOME"));
        return new MovieFinder(url, username, password);
    }
}
