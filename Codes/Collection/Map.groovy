def map = [:]
println map
println map.getClass().getName()

def person = [first:"Rakesh",last:"Yadav",email:"rakesh@gmail.com"]
println person
println person.first

//add new key value pair to existing map
person.twitter = "@kyrakesh"
println person

def emailKey = "Email Address"
def twitter = [username:"@kyrakesh",(emailKey):"rakesh@gmail.com"]

println person.size()
println person.sort() //sorting will be done on key

// looping through person
for( entry in person ) {
    println entry
}

for( key in person.keySet() ) {
    println "$key:${person[key]}"
}

// each | eachWithIndex