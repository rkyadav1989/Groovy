package com.rkyadav

@groovy.transform.ToString
class Employee implements Serializable{

    //properties are by default Private
    String first,last,email

    //public no-arg constructor is auto generated for groovy class

    //getter and setters are auto generated


    //write own getter & setters
    String fullName
    void setFullName(String name) {
        fullName = name
    }

    String getFullName() {
        "Full Name : ${fullName}"
    }

}

//compile this class and check the compiled class in out folder