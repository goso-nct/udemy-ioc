package ru.goso.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    String name;
    int age;
    @Autowired @Qualifier("dog")
    Pet pet;

    public Person() {
        System.out.println("Person no args constructor");
    }


    public Person(Pet pet) {
        System.out.println("Person constructor with 1 args: Pet");
        this.pet = pet;
    }

    public Person(String name, int age, Pet pet) {
        System.out.println("Person constructor with 3 args: name, age, pet");
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my pet !");
        pet.say();
    }

    public void init() { System.out.println("Person init"); }

    public void destroy()  { System.out.println("Person destroy"); }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", there is a pet=" + (pet != null) +
                '}';
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) {
        System.out.println("Person setPet");
        this.pet = pet;
    }
}
