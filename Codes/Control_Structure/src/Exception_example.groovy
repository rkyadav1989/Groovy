
//Exception
/*
In groovy every exception is optional and this goes for checked exception as well and this means that they do not need to be part of checked exception.
So in Java, we may have a method that is public void foo.
And if we're going to throw an exception, let's just say we'll throw a new exception so we throw a
new exception if we do this in Java.
This needs to be part of the method signatures.
So we need to say this does throw a kind of type exception when groovy.
We don't need to do that.
 */
/*
Java Example
public void foo() throws Exception { // so , here we need to say that this method throw exception
    throw new Exception()
}

*/


import java.lang.Exception
//Groovy Example
def foo() {
    throw new Exception ("Foo Exception")
}



List log = []

try {
    foo()
} catch (Exception e) {
    log << e.message
} finally {
    log << 'finally'
}

println log

//java 7 has introduce multi catch syntax
try {
    //do stuff
}catch( FileNotFoundException | NullPointerException e) {
    println e.class.name
    println e.message
}