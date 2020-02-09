package com.greenlearner.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class AnnotationPrcoessor {
    public static void main(String[] args) {
        Class clas = AnnotationUsage.class;

        Method[] declaredMethods = clas.getDeclaredMethods();

        for(Method m : declaredMethods){
            System.out.println("method - " + m.getName());
            Annotation[] annotations = m.getAnnotations();
            for(Annotation ann : annotations){

                if(ann instanceof MyAnnotation){
                    MyAnnotation ma = (MyAnnotation) ann;
                    System.out.println(ma.message() + " - " + ma.cost());
                    if(ma.cost() > 100){
                        //do some specific things which is for > 100
                    }
                }
            }
        }

        System.out.println("constructor annotations!!");

        Constructor[] constructors = clas.getConstructors();
        for(Constructor c : constructors){
            Annotation[] annotations = c.getAnnotations();
            for(Annotation ann : annotations){
                if(ann instanceof MyAnnotation){
                    MyAnnotation ma = (MyAnnotation) ann;
                    System.out.println(ma.message() + "-" + ma.cost());
                }
            }
        }

    }
}
