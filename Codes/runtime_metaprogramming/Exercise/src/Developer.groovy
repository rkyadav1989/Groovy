class Developer {

        String first
        String last
        String email
        List languages

    def invokeMethod(String name, Object args) {
        println "invokeMethod $name()is called with $args"
    }

    def getProperty(String property) {
        def value = metaClass.getProperty(this,property)
        "value of $property is $value"
    }

    void setProperty(String property, Object newValue){
        println ("set Property is called for $property with values $newValue")
        metaClass.setProperty(this,property,newValue)

    }
}


