package ru.goso.school;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    public Dog() { System.out.println("Dog no args constructor"); }

    @Override
    public void say() { System.out.println("Гав-гав"); }

    public void init() { System.out.println("Dog init"); }

    public void destroy()  { System.out.println("Dog destroy"); }
}
