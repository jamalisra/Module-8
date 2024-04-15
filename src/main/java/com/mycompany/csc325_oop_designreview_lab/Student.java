/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private double GPA;

    // Constructor for creating a student object with name and age.
    public Student(String name, short age) {
        super(name, age);
    }

    public Student(String name, short age, double GPA) {
        super(name, age);
        this.GPA = GPA;
    }

    // Getter method for retrieving the students GPA
    public double getGPA() {
        return GPA;
    }

    // Setter method for setting the students GPA
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", GPA=" + GPA +
                '}';
    }
}

