////Arithemetic Operators
//
//assert 10 + 1 == 11
//assert 10 - 1 == 9
//assert 10 * 2 == 20
//assert 10/5 == 2
//assert 10% 3 == 1
//assert 10 ** 2 == 100
//
//
////the binary arithmetic operators, we have seen above are also available in an assignment form
////  += -= *= /= %= **=
//
//def a = 1
//a += 5 //a = a + 5
//assert a == 15
//
//
////Relation OPerators
//
//assert 1 + 2 == 3
//assert 3!= 4
//assert -2 < 3
//assert 2 <= 2
//assert 3 <= 4
//assert 5 > 1
//assert 5 >= -2
//
//
////Logical Operators
//assert !false // logical not
//assert true && true //and
//assert true || false //OR
//
//
//
////Conditional Opreator
////c1.Ternary Operator
//String s = ""
//if ( s != null && s.length() > 0 ){
//    result = 'Found'
//    } else {
//    result = 'Not Found'
//}
//
////above can done using Ternary Operator
//String s1 = ""
//result = (s1 != null && s1.length() > 0 ) ? 'Found' : 'Not Found'
//
////if above condition holds true then we will assign Found else we will assign Not Found
//
//
//
////Elvis operator
//displayName = user.name ? user.name : 'Anonymous' //so if username exist then use it else use 'Anonymous'
//displayName = user.name ?: 'Anonymous' //same as above
//
//
//
////Object Operator -- imp
//    //Safe Navigation Operator
//
//    //java
//    Person p = new Person()
//    if (p.address != null) {
//        Address address = p.address
//        address.first = "1234 Main"
//    }
//    //so here we wanna check that Person has a valid address object; before we do any particular operation on that object
//
//
//    //Groovy
//    def address = p?.address // so here it wont set null pointer exception, but set address object to null
//    assert address == null
