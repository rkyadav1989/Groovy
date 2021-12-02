package toString

import groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])
//read more in documentation

class Person {
    String first
    String last
    String email
}

