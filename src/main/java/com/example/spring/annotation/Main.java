package com.example.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by saml on 6/4/2018.
 */
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new FileSystemXmlApplicationContext
//                ("/src/main/java/com/example/spring/annotation/spring-annotation.xml");
//        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
//        simpleMovieLister.getMovieFinder().print();
//        System.err.println(simpleMovieLister.getApplicationContext().getApplicationName());
//         MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
//         movieRecommender.print();
        ApplicationContext context1 = new AnnotationConfigApplicationContext("com.example.spring.annotation");
//        MovieCatalog movieCatalog = context1.getBean( MovieCatalog.class);
//        movieCatalog.print();
        MovieRecommender movieRecommender = context1.getBean("movieRecommender", MovieRecommender.class);
        System.err.println(movieRecommender.getMovieCatalog().getCatalog());

//        movieRecommender.print(context1.getBean("thirdMovieCatalog", MovieCatalog.class));

    }
}
