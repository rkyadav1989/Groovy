// Looping
// --------------------------------------------

// while
List numbers = [1,2,3]
while( numbers ) {
    // do something : removing value at index 0 until list is empty
    numbers.remove(0)
}

assert numbers == []

// for
/*
for( variable in iterable ) {

}
*/

List nums = [1,2,3]
for (i in nums) {
    println i
}
for( Integer i in 1..10 ) {
    println i
}

for( i in 1..5 ) {

}

Closure c = { }


// return/break/continue

String getFoo() {
    "foo" //last line of method is a return statement
}

Integer a = 1
while( true ) { // infinite loop
    a++
    break
}
assert a == 2

for( String s in 'a'..'z' ){
    if( s == 'a') continue // continue says do not continue with next action but continue with next iteration, so 'a' will not be printed
    println s
    if( s > 'b' ) break
}