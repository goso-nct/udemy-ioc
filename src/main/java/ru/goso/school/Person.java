package ru.goso.school;

public class Person {

    String name;
    int age;
    Pet pet;

    public Person() {}

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("Hello my pet !");
        pet.say();
    }

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
    public void setPet(Pet pet) { this.pet = pet; }
}
