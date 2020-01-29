package com.greenlearner.serialization.inheritance;

import com.greenlearner.serialization.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class DeserializeInheritanceObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //read the object
        File file = new File("inheritance.ser");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);


        GovtEmployee employee = (GovtEmployee) ois.readObject();
        System.out.println("Deserialized emp - " + employee);
        //Actual emp - Employee{id=101, name='Arvind', address='Noida', category='TEMP', department='IT'}
        //GovtEmployee{areaOfExpertise='CS', rating=9.8}
    }
}
