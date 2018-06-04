package com.example.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InstantiationTracingBeanPostProcessor1 implements BeanPostProcessor, Ordered {
    // simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean; // we could potentially return any object reference here...
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Bean 1 '" + beanName + "' created 1 : " + bean.toString());
        return bean;
    }
    @Override
    public int getOrder() {
        return 1;
    }
}
