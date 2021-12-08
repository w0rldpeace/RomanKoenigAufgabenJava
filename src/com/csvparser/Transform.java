package com.csvparser;

@FunctionalInterface
public interface Transform {

    //Kann implementiert und ueberschrieben werden fuer ein "custom" transform
    String transform(Object o);
}
