package com.greenlearner.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class DeserializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //read the object
        File file = new File("arvind123.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);


        Employee employee = (Employee) ois.readObject();
        System.out.println("Deserialized emp - " + employee);
        //Actual emp - Employee{id=101, name='Arvind', address='Noida', category='TEMP', department='IT'}
    }
}
