package com.greenlearner.serialization.inheritance;

import java.io.Serializable;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class Address implements Serializable {
    private String city;
    private String state;

    public Address() {
        System.out.println("Address constructor called");
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
