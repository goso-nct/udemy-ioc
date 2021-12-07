package ru.goso.school;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet murka = context.getBean("Мурка", Pet.class);
        murka.say();
        Pet tuzik = context.getBean("Тузик", Pet.class);
        tuzik.say();
        context.close();
    }
}
