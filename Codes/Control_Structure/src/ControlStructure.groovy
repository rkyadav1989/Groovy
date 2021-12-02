//if
if ( true ) {
    println "true"
}

//if-else
if ( true ) {
    println "true"
} else {
    println "false"
}

def age = 37
if ( age >= 21 ) {
    println "buy your beer"
} else if ( age > 35 ) {
    println "buy more beer"
} else {
    println " you are under 21"
}

//------------------------------------------------------------------------------------------------------------------
//ternary operator (expression) ? true : false
def name = 'Rakesh'
def isitRakesh = (name.toUpperCase() == 'RAKESH') ? 'YES' : 'NO'
//here if expression (left side of of ?) hold true then action left to : will be done else action right to : will be done
println isitRakesh

def msg
def output = (msg != null) ? msg : 'default message...'

def elvisOutput = msg ?: 'default message...' //same as above

println msg
println output
println elvisOutput


def num = 12

//break is must and good practice ; if we don't use break switch statement holds true for every thing between matching condition and default
switch( num ) {
    case 1 :
        println "1"
        break
    case 2 :
        println "2"
        break
    case 1..3 :
        println "in range 1..3"
        break
    case [1,2,12] :
        println "num is in list [1,2,12]"
        break
    case Integer :
        println "num is an Integer"
        break
    case Float :
        println "num is a float"
        break
    default :
        println "default..."
}

// in
def validAges = 18..35
def someAge = 19
println someAge in validAges