package com.inheritance
import com.inheritance.domain.Iphone

//here we are instantiating Iphone class with properties of Phone class. Because Iphone class does inherit the Phone class
Iphone phone = new Iphone(name:"iPhone",appStore: "Apple Store", os: "ios")
println phone
phone.powerOn()

