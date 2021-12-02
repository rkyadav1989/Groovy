if ( true) {
    println "true"
}

//Boolean
assert true
assert !false

//Matcher
assert ('a' =~ /a/)
//assert ('a' =~ /b/) //this will evaluate to false

//collection
assert [1]
//assert [] //this will false
assert ![]

//String
assert 'a'
assert !''

//Number
assert 1
assert !0

//none of the above
assert new Object()

//if we create a class person type variable (object) and does not instantiate  it then it will evaluate to false