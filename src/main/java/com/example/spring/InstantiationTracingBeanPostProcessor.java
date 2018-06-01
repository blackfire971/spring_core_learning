package com.example.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor, Ordered {

    // simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.err.println("Begin post process before initialization");
        return bean; // we could potentially return any object reference here...
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.err.println("Run postProcessAfterInitializtion method");
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
