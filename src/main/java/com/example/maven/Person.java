package com.example.maven;

class Person{
    private String name;
    private String LastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public Person(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }
}