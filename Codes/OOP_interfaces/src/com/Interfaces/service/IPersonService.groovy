package com.Interfaces.service
import com.Interfaces.domain.Person


//common naming convention for Interface starts with "I". It is best practice
// Interfaces are same as class with little difference. It is bunch of abstract methods (i.e. define name of method and return type but do not define method type)  .

interface IPersonService {
    //This method return a Person
    Person find()

    //This method returns the list of Persons
    List<Person> findAll()
}

//If we implement this interface then we MUST provide implementation of these methods 'find & findAll'.