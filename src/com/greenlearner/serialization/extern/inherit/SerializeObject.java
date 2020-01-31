package com.greenlearner.serialization.extern.inherit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class SerializeObject {
    public static void main(String[] args) throws IOException {
        GovtEmployee emp = new GovtEmployee();
        emp.setId(101);
        emp.setName("Arvind");
        emp.setAddress("Noida");
        emp.setCategory("TEMP");
        emp.setDepartment("IT");
        List<String> listOfTask = Arrays.asList(new String[]{"task1","task2"});
        emp.setListOfTask(listOfTask);
        Integer[] scores = {1,2,4,5};
        emp.setScores(scores);
        emp.setRating(10.10);
        emp.setAreaOfExpertise("Computers!!");

        System.out.println("Actual emp - " + emp);

        File file = new File("extern.ser");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        //storing the object
        oos.writeObject(emp);
    }
}
