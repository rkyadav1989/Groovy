/*

String.metaClass.shout = { -> toUpperCase() }
//So here we are redefining a shout method in metaclass of String Class. It may create problem in case of application unless we do a proper documentation.

println "Hello, World!".shout()

//So , to avoid above situation we do make use of category class, which allows us to confine and only add methods to a particular block of code instead of just application wide.


 */

//So here we gonna use category class using "use" keyword

use(StringCategory){
    println "Hello, World".shout()
}

//so here we can access same method by instantiating object, so category class are used for general purpose and used without help of object
StringCategory sc = new StringCategory()
println sc.shout("ka guru ka hal")

