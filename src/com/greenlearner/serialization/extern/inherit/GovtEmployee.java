package com.greenlearner.serialization.extern.inherit;

import com.greenlearner.serialization.inheritance.Address;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class GovtEmployee extends Employee  {
    private String areaOfExpertise;
    private double rating;


    public String getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(String areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        super.writeExternal(out);
        out.writeObject(areaOfExpertise);
        out.writeDouble(rating);
        System.out.println("govt write external");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        super.readExternal(in);
        areaOfExpertise = (String)in.readObject();
        rating = in.readDouble();
        System.out.println("govt read external");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "GovtEmployee{" +
                "areaOfExpertise='" + areaOfExpertise + '\'' +
                ", rating=" + rating +

                '}';
    }
}
