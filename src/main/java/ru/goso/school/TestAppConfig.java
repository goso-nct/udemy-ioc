package ru.goso.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAppConfig {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var person = context.getBean("person", Person.class);
        person.callPet();
    }
}
