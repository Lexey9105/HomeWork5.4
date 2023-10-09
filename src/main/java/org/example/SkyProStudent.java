package org.example;

import java.util.Objects;

public class SkyProStudent extends Student{

    private String name;
    private int age;

    public SkyProStudent(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }


    public void greetings(){
        System.out.println("Hello "+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SkyProStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkyProStudent skyProStudent = (SkyProStudent) o;
        return age == skyProStudent.age && Objects.equals(name, skyProStudent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
