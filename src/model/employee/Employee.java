package model.employee;

import data.Gender;

public class Employee {
    
    
    private String name;
    private int id;
    private static int count = 1;
     private int age;
    private Gender gender;
    private long cellNumber;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
