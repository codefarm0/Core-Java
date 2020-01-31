package com.greenlearner.serialization.inheritance;

import com.greenlearner.serialization.Employee;

import java.io.Serializable;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class GovtEmployee extends Employee implements Serializable {
    private String areaOfExpertise;
    private double rating;
    private Address address;

    public GovtEmployee(String areaOfExpertise, double rating) {
        super("arvin");
        System.out.println("govt 2 constructor called");
        this.areaOfExpertise = areaOfExpertise;
        this.rating = rating;
    }

    public GovtEmployee() {
        super("arvind");
        System.out.println("govt constructor called");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "GovtEmployee{" +
                "areaOfExpertise='" + areaOfExpertise + '\'' +
                ", rating=" + rating +
                ", address=" + address +
                '}';
    }
}
