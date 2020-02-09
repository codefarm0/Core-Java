package com.greenlearner.annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
@SuppressWarnings("all")
public class AnnotationsInJavaDemo {

    public static void main(String[] args) {
        AnnotationsInJavaDemo obj = new AnnotationsInJavaDemo();
        System.out.println(obj);
        List list = new ArrayList();
        list.add(123);
        list.add("arvind");
        System.out.println(list);
        testMethod();
    }

    @Override
    public String toString() {
        return "AnnotationsInJavaDemo{}";
    }

    @Deprecated
    static String testMethod() {
        return "short lived!!";
    }
}
