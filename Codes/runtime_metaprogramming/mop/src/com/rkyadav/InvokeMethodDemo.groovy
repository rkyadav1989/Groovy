package com.rkyadav

import groovy.transform.ToString

//This method is called when the method you called is not present on a Groovy object

@ToString
class InvokeDemo {

    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }

    def test() {
        return "method exists"
    }
}
def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "method exists"
//So, it is working as expected

//assert invokeDemo.someMethod() == ''
/*
So, we are trying to access a method which is not defined in class then we will get error " No signature of method: com.rkyadav.InvokeDemo.someMethod() "
    - we can prevent this situation by implementing invokeMethod of interface GroovyObject (check compiled class). So this way we can handle a method which is
    not defined in the class
 */

//now we will try to call again the method which is not defined
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'

