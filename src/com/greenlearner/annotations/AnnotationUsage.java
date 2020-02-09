package com.greenlearner.annotations;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */


public class AnnotationUsage {

    @MyAnnotation(message = "this is type", cost = 123)
    private String type;
    private String item;

    @MyAnnotation(cost = 987)
    public AnnotationUsage(String type, String item) {
        this.type = type;
        this.item = item;
    }

    @MyAnnotation(cost = 321)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
