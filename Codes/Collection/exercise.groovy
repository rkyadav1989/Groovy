/*An Enum is a collection of constant values. We can use this collection of constants to create ranges.
1) create an enum for days of the week. ex Sunday, Monday, etc...
2) Create a range from that enum
3) Print the size of the Range
4) Use the contains method to see if Wednesday is in that Range
5) Print the from element of this range
6) Print the to element of this range
 */
println "------------------------Range Output Start -------------------------------"
enum DaysOfWeek {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
println DaysOfWeek.values()

Range range = DaysOfWeek.Sunday..DaysOfWeek.Saturday
println "range is : ${range}"
println range.size()


assert "${range}".contains("Wednesday")

assert range.contains(DaysOfWeek.Wednesday)
println range.getFrom()
println range.getTo()

println "------------------------Range Output End -------------------------------"

/*
--------------------------------------------------------------------------
Lists

Create a list days (Sun - Sat)
Print out the list
Print the size of the list
Remove Saturday from the list
Add Saturday back by appending it to the list
Print out the Wednesday using its index
------------------------------------------------------------------------
 */
println "------------------------List Output Start -------------------------------"
def dayslist = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"]
println dayslist
for (days in dayslist) {
    println days
}


dayslist.removeLast()
println dayslist

dayslist.putAt(6, "Sat") //dayslis << "Sat"
println dayslist

println dayslist.getAt(3)
println "------------------------List Output End -------------------------------"



/*
Create a map of days of the week
1: Sunday, 2:Monday, etc...
Print out the map
Print out the class name of the map
Print the size of the map
Is there a method that would easily print out all of the days (values)?
Without closures you may have to look at the Java API for LinkedHashMap
 */


println "------------------------Map Output Start -------------------------------"

Map mapdays = [1:"Sunday",2:"Monday",3:"Tuesday",4:"Wednesday",5:"Thursday",6:"Friday",7:"Saturday"]

println mapdays
println mapdays.getClass().getName()
println mapdays.size()
println mapdays.values()
println "------------------------Map Output End -------------------------------"
