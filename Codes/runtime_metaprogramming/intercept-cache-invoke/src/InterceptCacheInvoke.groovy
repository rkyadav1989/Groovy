//Intercept - Cache -Invoke Pattern

//ExpandoMetaClass.enableGlobally()
// or estends Expando class
class Developer extends Expando {

    List languages = []

    def methodMissing(String name, args){
        println "missing method $name was called"

        if ( name.startsWith('write') ) {
            String language = name.split("write")[1]
            //write is used as delemeter. So for writegroovy method item [0] will be write and [1] will be Groovy

            if ( languages.contains(language) ) {
                def impl = { Object[] theArgs ->
                    println "I like to write code in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }

}

Developer d = new Developer()
d.languages << "Groovy"
d.languages << "Java"

println d.metaClass.methods.size()

d.writeGroovy()
//so when first time method called then it will use missingMethod and we create a method in Metaclass and when next time this method is called,
// we will find defined method in metaclass

d.writeGroovy()
d.writeGroovy()
println d.metaClass.methods.size()

d.writeJava()
d.writeJava()
d.writeJava()

println d.metaClass.methods.size()