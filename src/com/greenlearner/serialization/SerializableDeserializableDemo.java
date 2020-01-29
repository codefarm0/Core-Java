package com.greenlearner.serialization;

import java.io.*;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class SerializableDeserializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Arvind");
        emp.setAddress("Noida");
        emp.setCategory("TEMP");
        emp.setDepartment("IT");

        System.out.println("Actual emp - " + emp);

       File file = new File("arvind.ser");
       FileOutputStream fileOutputStream = new FileOutputStream(file);
       ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

       //storing the object
       oos.writeObject(emp);

       emp.setName("Green Learner");
       emp.setDepartment("New IT");
       //read the object
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);


        Employee employee = (Employee) ois.readObject();
        System.out.println("Deserialized emp - " + employee);

    }
}
