package com.roman;

import java.util.Comparator;

public class AgeComporator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getAge() == person2.getAge()){

            return 0;
        }
        else if(person1.getAge() != person2.getAge()){

            if(person1.getAge() > person2.getAge()){
                return 1;
            }
        }
        return -1;
    }
}
