package com.roman;

public class Person {

    private int age;
    private String surname;
    private String lastName;
    private int height;
    private int weight;

    public Person(String lastName, String surname, int height, int weight, int age){
        this.lastName = lastName;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public boolean equals(Person person){
        return getLastName().equals(person.getLastName()) &&
                getSurname().equals(person.getSurname()) &&
                getHeight() == person.getHeight() &&
                getWeight() == person.getWeight() &&
                getAge() == person.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
