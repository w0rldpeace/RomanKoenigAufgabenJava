package com.roman;

import com.csvparser.CSVField;

import java.util.Objects;

public class Person implements Comparable<Person> {

    @CSVField(0)
    private String lastName;
    @CSVField(1)
    private String surname;
    @CSVField(2)
    private int age;
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


    @Override
    public int hashCode() {

        return Objects.hash(age, surname, lastName, height, weight);
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

    @Override
    public int compareTo(Person o) {
        // mit was ich die person vergleichen / wie?
        AgeComporator ac = new AgeComporator();
        HeightComparator hc = new HeightComparator();

        if(ac.compare(this, o) == 0){
            if(hc.compare(this, o) == 0)

            return 0;
        }
        else {
            return hc.compare(this, o);
        }

        return ac.compare(this, o);
    }
}
