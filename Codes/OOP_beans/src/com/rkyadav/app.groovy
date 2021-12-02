package com.rkyadav

Employee emp = new Employee(first: "Rakesh", last: "Yadav", email: "rakesh@email.com")
println emp

DoubleBean db = new DoubleBean()
db.value = 100 //here we are using setter method of double bean
println db.value //here we are using getter method of DoubleBean class

println db.@value  // here we are not using defined getter, though we are getting value without using getter method


