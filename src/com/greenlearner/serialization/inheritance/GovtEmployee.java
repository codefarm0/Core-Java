package com.greenlearner.serialization.inheritance;

import com.greenlearner.serialization.Employee;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class GovtEmployee extends Employee {
    private String areaOfExpertise;
    private double rating;
    private Address address;

    public GovtEmployee(String areaOfExpertise, double rating) {
        this.areaOfExpertise = areaOfExpertise;
        this.rating = rating;
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
