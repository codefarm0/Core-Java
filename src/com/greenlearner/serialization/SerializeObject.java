package com.greenlearner.serialization;

import java.io.*;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class SerializeObject {
    public static void main(String[] args) throws IOException {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Arvind");
        emp.setAddress("Noida");
        emp.setCategory("TEMP");
        emp.setDepartment("IT");

        System.out.println("Actual emp - " + emp);

        File file = new File("arvind123.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        //storing the object
        oos.writeObject(emp);
    }
}
