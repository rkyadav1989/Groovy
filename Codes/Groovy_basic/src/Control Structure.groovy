//if

if (true)
    println("condition is true")

//false | null | empty strings | empty collction

if (false )
    println " value is false"

//negation
if (!false )
    println " value is not false"

//null will be evaluated to false
String name = null
if (name )
    println "name has a value"

String lastname = ""
if (lastname )
    println "last name has a value"


//if -else
def x = 10
if (x == 10) {
    println " x is 10"
} else {
    println " x i not 10 "
}


//while
def i = 1
while (i <= 10) {
    println i
    i++
}



//for in list
def list = [1,2,3,4]
for (num in list) {
    println num
}


//closure -- later will be in detail
def list2 = [1,2,3,4]
list2.each { println it }
//it is a special keyword


//switch
def myNumber = 10

if (myNumber == 1) {
    println "myNumber is 1"
}

if (myNumber == 2) {
    println "myNumber is 2"
}

// instead of 10 if we can use wswitch
switch(myNumber) {
    case 1:
        println "number is 1"
    default:
        println "we hit the default case"
}