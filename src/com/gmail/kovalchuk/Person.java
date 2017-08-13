package com.gmail.kovalchuk;


public class Person {
    private String namme;
    private String lastName;
    private int age;

    public Person(String namme, String lastName, int age) {
        super();
        this.namme = namme;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
        super();
    }

    public String getNamme() {
        return namme;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setNamme(String namme) {
        this.namme = namme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}