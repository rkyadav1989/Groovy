package com.traits.Traits

trait FlyingAbility {
//So here its is same as Java8 interfaces with default method. So, if we implement this trait, it is not necessary that we declare method fly().
// Check class Bird in this package
    String fly() {
        "I am flying"
    }

    //But still if we want to create abstract method and want a implementer of trait to declare the method then it can be done as below
    abstract foo()

    //We can also define private method inside our trait and this method should not be declared in implemented class
    private String bar() {
        "bar"
    }
}

