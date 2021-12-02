for( int x = 1; x <= 10; ++x) {
    print x
}

println ""

for( int y = 10; y >= 1; --y) {
    print y
}

println ""

def letters = ['a','b','c']
for( int i = 0; i < letters.size(); ++i) {
    print letters[i]
}


// now we will start creating range
def r = 1..10
/*from .. to
if we define range like 1..<10 then range includes everything less than 10
*/
println r
println r.class.name
println r.from
println r.to

assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert (0..<10).contains(0)
assert (0..<10).contains(10) == false

Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

println today
println oneWeekAway

def days = today..oneWeekAway
println days

def alphabet = 'a'..'z'
println alphabet


IntRange num = new IntRange(10,20)
println num


IntRange num1 = 30..40
println num1


groovy.lang.Range num2 = 50..60
println "${num2}"



