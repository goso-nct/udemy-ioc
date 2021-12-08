package ru.goso.school;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi1 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.callPet();
        context.close();
    }
}