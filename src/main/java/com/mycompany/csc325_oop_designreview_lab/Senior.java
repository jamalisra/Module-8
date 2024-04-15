package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private int credits;

    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits >= 85) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Senior students must have at least 85 credits.");
        }
    }
    @Override
    public String toString() {
        return "Senior{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", GPA=" + getGPA() +
                ", credits=" + credits +
                '}';
    }


}

