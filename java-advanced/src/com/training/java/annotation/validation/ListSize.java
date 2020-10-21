package com.training.java.annotation.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          ElementType.FIELD
})
public @interface ListSize {

    int max();

    int min() default 1;
}
