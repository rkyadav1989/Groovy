//implicit parameter: nothing is passed in and we are expecting something

def foo = {
    println it
}

foo ('Rakesh')

List l = ['Rakesh', 'Yadav']
foo (l)

//So, if we are passing an argument; which has no argument name for accepting  then it is always going to be accepted by keyword "it"


//closure with no parameters, don't specify parameter name before arrow
def noparams =  { ->
    println "it will not accept any parameters .. "
}

noparams() //this will run
//noparams ('rakesh') //this will fail



//Closure with multiple argument
def sayHello = { first, last ->
    println "Hello $first $last "
}

sayHello ('Rakesh', 'Yadav')

//closure wth default value
//we can also define parameter type
def greet = { String greeting = 'Hello', String name , String dot = '......'->
    println "$greeting , $name $dot"
}

greet ('Good morning' , 'Rakesh')
greet ('Pim' ) //here only one parameters passed and it mapped it correctly with parameter not having any default


//Variable number of arguments (3 dots)
def concat = { String... args ->
    args.join ('')
}

println concat ('abc', 'def')
println concat ('abc', 'def', '2246' , 'xyz' )


//method which accepts closure as argument
def someMethod (Closure c) {
    println "....................."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x + y }
someMethod(someClosure)
