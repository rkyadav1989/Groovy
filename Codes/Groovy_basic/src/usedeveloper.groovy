
//create a new instance of a developer
Developer d = new Developer ()
//test d = new test()
d.first = "Rakesh"
d.setLast("Yadav")
//above know as synthetic accessor for last


d.languages << "Groovy"
d.languages << "java"

println(d)
d.work()