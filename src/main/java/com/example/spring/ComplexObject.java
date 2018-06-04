package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * Created by saml on 5/11/2018.
 */
public class ComplexObject {
    private List<String> list;

    public Injection getInjectionTest() {
        return injectionTest;
    }

    public void setInjectionTest(Injection injectionTest) {
        this.injectionTest = injectionTest;
    }

    private Injection injectionTest;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }

    private Map<String, Double> map;

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/context/core.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("/src/main/java/com/example/spring/context/core.xml");
//        ComplexObject complexObject = context.getBean("test", ComplexObject.class);
//        List<String> list1 = complexObject.list;
//        for (String s :
//                list1) {
//            System.err.println(s);
//        }
//        Injection injection = complexObject.getInjectionTest();
//        System.err.println(injection);
//        injection.print();

        Injection injection1 = context.getBean("injection", Injection.class);
        System.err.println("injection object property name:" + injection1.name);
        System.err.println(injection1);

//        Service2 service2 = context.getBean("service2", Service2.class);
//        System.err.println(service2.getInstance2());



//        AppPreferences appPreferences = context.getBean("appScopeTest", AppPreferences.class);
//        System.err.println(appPreferences);

    }


}
