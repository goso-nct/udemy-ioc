package ru.goso.school;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {

    public Cat() { System.out.println("Cat no args constructor"); }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}