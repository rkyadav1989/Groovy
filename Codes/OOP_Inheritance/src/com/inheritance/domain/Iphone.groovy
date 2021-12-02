package com.inheritance.domain

//This will inherit the property and methods of class Phone. So that we do not need to create those properties again.

class Iphone extends Phone {

    String iosVersion
    def homeButtonPressed(){

    }

    def airPlay() {

    }

    @Override
    def powerOn() {
        println " we did overwritten method defined in inherited class"
    }

}
