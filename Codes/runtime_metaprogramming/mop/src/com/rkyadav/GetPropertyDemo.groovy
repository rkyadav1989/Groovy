package com.rkyadav

//Every read access to a property can be intercepted by overriding the getProperty() method of current object

class PropertyDemo  {

    def getProperty(String name) {
        println "missing property found $name"

        if (metaClass.hasProperty(this,name)) {
            metaClass.getProperty(this,name)
        } else {
            println "lets do something fun with this property $name"
            return "partytime"
        }

    }
    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

}

def pd = new PropertyDemo()

println pd.prop1
println pd.prop2
println pd.prop3
//All these properties are defined within the class so assessing it will not be a problem

println pd.prop4
//we will get error as property not defined in class "groovy.lang.MissingPropertyException:No such property: prop4 for class: com.rkyadav.PropertyDemo"
//as soon as we override get property method; we will not face issues with properties not defined
//the other way of doing same is implementing propertyMissing method. Please check PropertyMissingDemo