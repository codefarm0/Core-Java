package com.greenlearner.annotations;

import java.lang.annotation.*;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */

@Target({ElementType.METHOD,ElementType.FIELD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {
    String message() default "this is default msg";
    int cost();
}
