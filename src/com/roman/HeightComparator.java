package com.roman;

import java.util.Comparator;

public class HeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        if(person1.getHeight() == person2.getHeight()){

            return 0;
        }
        else if(person1.getHeight() != person2.getHeight()){

            if(person1.getHeight() > person2.getHeight()){
                return 1;
            }
        }
        return -1;
    }
}
