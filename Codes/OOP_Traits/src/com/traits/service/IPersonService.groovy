package com.traits.service

public interface IPersonService {

    default  public void doSomething() {
        System.out.println("doing something .... ") ;
    }

}

//This is default method in java8, so we can implement if we want to otherwise default action will be taken
//So, we can implement this interface in java8 but we need not to declare this method
//This Interface is only used for explaining java 8 default method