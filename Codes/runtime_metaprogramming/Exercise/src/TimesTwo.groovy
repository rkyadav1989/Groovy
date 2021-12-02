/*Integer.metaClass.timesTwo = { delegate * 2}

println 2.timesTwo()
println 4.timesTwo()
println 5.timesTwo()
println 10.timesTwo()
This is not the safe way, because here we are modifying Integerclass
*/

class TtimesTwo {

    static Integer timesTwo(Integer input){
        def output = input * 2
        output
    }
}

use(TtimesTwo) {
    println 2.timesTwo()
    println 4.timesTwo()
    println 5.timesTwo()
    println 10.timesTwo()
}