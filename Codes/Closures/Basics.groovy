def c = { }
//same can be defined as Closure c = { }

println c.class.name
println c instanceof Closure //return boolean value

def sayHello = { name ->
    println "Hello, $name"
}
/*
we separate closure argument from closure body using arrow
 */

sayHello('Rakesh')

List nums = [1,4,7,4,30,2]
nums.each { num ->
    println num
}
/*
So by default if there are no arguments passed into a closure there is a special reserved keyword called it. in above example try removing num from argument and try printing it.
List nums = [1,4,7,4,30,2]
nums.each {
    println it
}
 */


// closures are objects & last param
//Here we are trying to define a method which accepts closure as last argument
def timesTen(num,closure) {
    closure(num * 10)
}

//so any method which accepts closure as the last argument has a special idiomatic way to print it out
timesTen(10, { println it })

//here we can also take it out from argument section
timesTen(2) {
    println it
}

//times method accepts closure as last argument
10.times {
    println it
}

import java.util.Random

Random rand = new Random()

3.times {
    println rand.nextInt()
}