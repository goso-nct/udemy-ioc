package ru.goso.school;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation1 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var person = context.getBean("person", Person.class);
        System.out.println(person);
        person.callPet();

    }
}
