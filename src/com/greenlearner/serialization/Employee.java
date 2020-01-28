package com.greenlearner.serialization;

import java.io.Serializable;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class Employee implements Serializable {
    private static String department;
    private int id;
    private String name;
    private String address;
    private transient String category;

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        Employee.department = department;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}