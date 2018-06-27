package com.example.spring.annotation.profile;

import com.example.spring.annotation.MovieFinder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //the profile must be identified before register the configuration class
//        ctx.getEnvironment().addActiveProfile("production");
//        ctx.getEnvironment().setActiveProfiles("productions", "developments")  ;
//        ctx.getEnvironment().addActiveProfile("default");
//        ctx.getEnvironment().setDefaultProfiles("development");
        ctx.getEnvironment().addActiveProfile("production");
        ctx.register( ProdConfig.class, DevConfig.class, DefaultConfig.class);
        ctx.refresh();

        MovieFinder movieFinder = ctx.getBean(MovieFinder.class);
        movieFinder.print();
    }
}
