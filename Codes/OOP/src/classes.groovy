class Person {

    String firstName, lastName
    //by default these variables will be private, there will be getter and setters will be generated at compile time
    //but if we specifically specify it as Private then getters and setters will not be generated
    def dob = '13/06/1989'
    // private : accessible only within the class
    // protected : which can be used in same package
    // public :
    protected String f1,f2,f3
    private Date createdOn = new Date()

    static welcomeMsg = 'HELLO'
    //static fields can be assessed without help of object ( this can be done outside class without creating an object "println Person.welcomeMsg")


    public static final String WELCOME_MSG = 'HELLO'
    //static final variable can not be changed

    // local variables
    def foo() {
        String msg = "Hello"
        String firstName = "Rakesh"
        println "$msg, $firstName"
    }



}

Person person = new Person()
person.foo()
println person.foo()
//why extra null is printed
