package com.quintrix.sb.model;

public class Employee {


    private String firstName;
    private String lastName;
    private int id;


    public Employee() {

    }


    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public int getID(){return  id;}


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
