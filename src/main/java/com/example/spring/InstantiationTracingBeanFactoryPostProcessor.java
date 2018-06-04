package com.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class InstantiationTracingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.err.println("Run postProcessBeanFactory method in InstantiationTracingBeanFactoryPostProcessor");
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("injection");
        MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
        if (mutablePropertyValues.contains("name")) {
            mutablePropertyValues.addPropertyValue("name", "name changed in class");
        }
    }
}
