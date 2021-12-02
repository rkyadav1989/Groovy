package com.rkyadav

// You can intercept write access to properties by overriding the setProperty() method:

class POGO {

    String property

    void setProperty(String name, Object value) {
        this.@"$name" = 'overridden'
        //@ used for field access
    }
}

def pogo = new POGO()
pogo.property = 'a'

assert pogo.property == 'overridden'

