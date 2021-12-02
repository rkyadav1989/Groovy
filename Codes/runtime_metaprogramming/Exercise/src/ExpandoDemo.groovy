import groovy.transform.ToString

Expando e = new Expando()

e.first = "Rakesh"
e.last  = "Yadav"
e.email = "danvega@gmail.com"

e.getFullName = {
    "$first $last"
}

println e
println e.getFullName()

//@groovy.transform.ToString(includeNames = true)
@ToString
//here annotation is used at compile time, so for below class when we print p then only first & last email will be known but
// setter used here to set value at runtime p.metaClass.email = "rakesh@gmail.com"
//and getter used here to get the value at runtime println p.email
class Person {
    String first, last
}

Person p = new Person(first: "rakesh", last: "yadav")
p.metaClass.email = "rakesh@gmail.com"
println p
println p.email