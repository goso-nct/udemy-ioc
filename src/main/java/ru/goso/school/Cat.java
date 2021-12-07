package ru.goso.school;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}