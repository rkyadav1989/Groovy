package com.Interfaces.service

import com.Interfaces.domain.Person

class PersonService implements IPersonService{
    @Override
    Person find() {
        Person p = new Person (first: "Rakesh", last: "Yadav")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person (first: "Rakesh", last: "Yadav")
        Person p2 = new Person (first: "Priyanka", last: "Yadav")
        [p1,p2]
    }
}
