package ru.goso.school;

public class Dog implements Pet{

    public Dog() { System.out.println("Dog constructor no args"); }

    @Override
    public void say() { System.out.println("Гав-гав"); }

    public void init() { System.out.println("Dog init"); }

    public void destroy()  { System.out.println("Dog destroy"); }
}
