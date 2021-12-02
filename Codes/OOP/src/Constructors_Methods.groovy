@groovy.transform.ToString
class Person1 {
    String first, last
    //constructor
 /*   public Person() {
        //return this
    }

  */

    //create own constructor
    Person1(String fullName) {
        List parts = fullName.split(' ')
        this.first = parts[0]  //work same way without this as well
        this.last = parts[1] //work same way without this as well
    }

    //methods
    public void foo(String a, String b) {
        // do stuff
    }

    String getFullName(){
        "$first $last"
    }

    def bar(){

    }

    //method with return type
    static String doGoodWork(){
        println "doing good work..."
    }

    //method with default values assigned to arguments
    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false ){

    }

    //method with variable number of arguments
    def concat(String... args) {
        println args.length
    }
}

Person1 p = new Person1("Rakesh Yadav")
println p
p.concat('1','b')
//here new ARG is nothing but zero ARG constructor
