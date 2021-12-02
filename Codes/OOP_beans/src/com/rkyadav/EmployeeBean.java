package com.rkyadav;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

    //private properties
    private String first;
    private String last;
    private String email ;


    //public no-arg constructor
    public EmployeeBean() {

    }

    //getter & setter
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //toString : It is not a requirement of bean but it is nice to have toString implementation
    @Override
    public String toString() {
        return "EmployeeBean{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
