package ru.goso.school;

public class Cat implements Pet {

    public Cat() { System.out.println("Cat constructor no args"); }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}