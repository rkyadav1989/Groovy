/*
Locate the class groovy.lang.Closure and spend a few minutes looking through documentation.
Create a Method that accepts a closure as an argument

Create a closure that performs some action
Call the method and pass the closure to it.

Create a list and use them each to iterate over each item in the list and print it out

Hint - You can use the implicit it or use your own variable

Create a map of data and iterate over it using each method.

This method can take a closure that accepts 1 or 2 arguments.

Use 2 arguments and print out the key and value on each line.

Demonstrate the use of curry and try to come up with an example different from the one we used in the lecture.
 */

def addTwoNumber (Closure c) {
//    println c.parameterTypes
}

def twoNumbers = { int x, int y ->
    println (x + y)
    }

addTwoNumber (twoNumbers(10,20))
//addTwoNumber (twoNumbers)

List list = [1,2,56,7,8,9,44]
list.each {println it}

def map = ["FirstName" : "Rakesh", "LastName" : "Yadav", "Email" : "rakesh.bmas056@gmail.com"]
println map.getClass().getName()

map.each {println it}
map.each { key, val -> println "$key:$val" }

//curry
def areaOfCircle = {Float Pi, Float radius ->
    println "area of circle is " + Pi*radius**2 }

areaOfCircle (3.14, 2)

def areaOfCirUsingRadius = areaOfCircle.curry(3.14)
areaOfCirUsingRadius(3)


/*
In the following exercises we are going to explore the GDK to find some methods that take closures and learn how to use them.
Hint - I would narrow your search to java.util.Collection, java.lang.Iterable & java.util.List

1) Search for the find and findAll methods.
    a) What is the difference between the two?
    b) Write some code to show how they both work.

2) Search for the any and every methods.
    a) What is the difference between the two?
    b) Write some code to show how they both work.

3) Search for the method groupBy that accepts a closure
    a) What does this method do?
    b) Write an example of how to use this method.
 */

/*
1) Search for the find and findAll methods.
    a) What is the difference between the two?
    Answers :
        find : Finds the first value matches with closure condition
        findAll : Find all the items matching with condition
    b) Write some code to show how they both work.
 */

def items = [1, 2,99,78,5,78,44,2,13,0]
println items.find {it > 10}
println items.findAll {it > 10}
println items.find {it == 0}


/*
2) Search for the any and every methods.
    a) What is the difference between the two?
    Answer :
        any : Iterates over the contents of an object or collection, and checks whether a predicate is valid for at least one element.
        every : Used to determine if the given predicate closure is valid (i.e. returns true for all items in this data structure).
    b) Write some code to show how they both work.
 */

def items2 = [99,78,5,78,44,13]
println items2.any {it > 10}
println items2.every {it > 10}
println items2.every {it >4}

/*
3) Search for the method groupBy that accepts a closure
a) What does this method do?
    Sorts all Iterable members into (sub)groups determined by the supplied mapping closures. Each closure should return the key that this item should be grouped by.
    The returned LinkedHashMap will have an entry for each distinct 'key path' returned from the closures, with each value being a list of items for that 'group path'
b) Write an example of how to use this method.
 */
def result = [1,2,3,4,5,6].groupBy([{ it % 2 }, { it < 4 }])
println result