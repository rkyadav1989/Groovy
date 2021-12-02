package com.traits.Traits

class Bird implements FlyingAbility, SpeakingAbility{

    @Override
    String fly() {
        "I am not flying"
    }
    //here we have overwritten fly method of FlyingAbilty trait and did not overwritten Speak method of SpeakingAbility method. So in trait we can define default
    // method and if required we can overwrite it or leave it.

    @Override
    def foo() {
        return null
    }
    //This must be overwritten as this is defined as abstract method


}
