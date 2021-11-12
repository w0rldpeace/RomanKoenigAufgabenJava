package com.roman;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {
    // ---- Shallow Copy ----
//        d = copy.copy(c)
//
//        print id(c) == id(d)          # False - d is now a new object
//        print id(c[0]) == id(d[0])    # True - d[0] is the same object as c[0]
    private T type;
    private List<T> list = new ArrayList<>();

    public List<T> shallowCopy(T type){

        list.add(type);

        return list;
    }

    public T getType() {
        return type;
    }

    public List<T> getList() {
        return list;
    }

    public void setType(T type) {
        this.type = type;
    }

}
