
// you must provide an assertion an expression that evaluates to true
assert true
//here nothing will happen

assert 1 == 1
// here it holds true , so nothing happen

assert false
// here exception will be thrown

assert 1==2


// the ppower assertion output shows evaluation result from outer to the inner expression
assert 1==2
/* below will be output
Assertion failed
assert 1 == 2
          |
          false
 which shows equlity operation does not holds true
 */


//the power assertion statements true power unleashes in complex boolean statements,
//or statements with collection or other toString-enabled classes
def x = [1,2,3,4,5]
assert (x << 6 ) == [6,7,8,9,10]
// left shift operator <<