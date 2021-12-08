package com.csvparser;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CSVEntity {

    Class<? extends Transform> value();
}
