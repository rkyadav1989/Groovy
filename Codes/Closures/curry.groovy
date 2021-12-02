//http://groovy-lang.org/closures.html#_currying
/*
In Groovy, currying refers to the concept of partial application. It does not correspond to the real concept of currying in functional programming because of
the different scoping rules that Groovy applies on closures. Currying in Groovy will let you set the value of one parameter of a closure, and it will return a
new closure accepting one less argument. we can set values for more than one parameter same way
 */

def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}
log ("DEBUG", new Date(), "This is my first Debug statement")

def debugLog = log.curry ("DEBUG") //It will create a new closure (debugLog) from a closure , which will accept one less argument
debugLog (new Date(), "This is another debug statement" )
debugLog (new Date(), "This is one more " )


def todayDebugLog = log.curry("DEBUG",new Date())
todayDebugLog("This is today's debug msg")


//right curry
def rightcurry = log.rcurry("passing parameter from right to left")
rightcurry ("Error", new Date())


//index based currying
def indexcurry = log.ncurry(1,new Date()) //here we are setting value for argument at index 1 in log closure
indexcurry ("Debug", "This is my indexed log")

