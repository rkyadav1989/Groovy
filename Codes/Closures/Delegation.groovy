
//check document closure
//https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html

import java.lang.StringBuffer
def writer = {
    append "Rakesh "
    append "lives in Amsterdam"
}

//if we have have not defined this method then writer call would have been failed
/*
def append(String s) {
    println "append () called with argument of $s"
}
*/

/*what if there is a situation that method append lived in another class that we wanted to delegate responsibility. In our case there happens to be a class that
has append method. That class is string buffer
 */

StringBuffer sb = new StringBuffer()
//println writer.resolveStrategy = Closure.DELEGATE_FIRST
//def result = writer.delegate = sb
writer.delegate = sb
println writer()
//println result