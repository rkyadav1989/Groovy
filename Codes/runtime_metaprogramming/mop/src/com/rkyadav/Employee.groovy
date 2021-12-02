package com.rkyadav

class Employee {
}

/*check compiled class "Employee.class" in out folder and relate it to below points :
    - We see there class Employee implements GroovyObject (it means all classes implements GroovyObject). Now check the GroovyObject (ctrl+ click) then we find a
    interface which is have default methods "invokeMethod, getProperty, setProperty".
        - check invokeMethod.groovy for usage
 */