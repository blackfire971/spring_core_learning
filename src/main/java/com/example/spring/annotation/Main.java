package com.example.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by saml on 6/4/2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("/src/main/java/com/example/spring/annotation/spring-annotation.xml");
//        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
//        simpleMovieLister.getMovieFinder().print();
//        System.err.println(simpleMovieLister.getApplicationContext().getApplicationName());
         MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);

    }
}
