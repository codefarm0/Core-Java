package com.greenlearner.serialization.custom;

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
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Arvind");
        emp.setAddress("Noida");
        emp.setCategory("TEMP");
        emp.setDepartment("IT");
        List<String> listOfTask = Arrays.asList(new String[]{"task1","task2"});
        emp.setListOfTask(listOfTask);
        Integer[] scores = {1,2,4,5};
        emp.setScores(scores);
        System.out.println("Actual emp - " + emp);

        File file = new File("arvind1234.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        //storing the object
        oos.writeObject(emp);

        //cleaning-up the streams
        fileOutputStream.flush();
        fileOutputStream.close();
        oos.flush();
        oos.close();
    }
}
