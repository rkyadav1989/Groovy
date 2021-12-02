// each & eachWithIndex
List favNums = [2,10,4,8,11,77]

//traversing through list using for loop :old way
for (num in favNums) {
    println num
}

//this is traversing using closure
favNums.each {
    println it
}

//index with value old way
for( int i=0; i<favNums.size(); i++){
    println "$i:${favNums[i]}"
}

//now using method eachWithIndex which accept closure 
favNums.eachWithIndex { num, idx ->
    println "$idx : $num "
}


//findAll method : finds all the values matching closure condition. So our closure must be having condition
List days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
//List weekend = days.findAll({ it.startsWith('S')}) //here find all method accepts only single closure so outer bracket not required and we can write same as below

List weekend = days.findAll{ it.startsWith('S')}
//our list days has string value
//it will have all the list items one by one and startsWith is a string method

println days
println weekend


//collect
List nums = [1,2,2,7,2,8,2,4,6]
List numsTimesTen = []
nums.each{ num ->
    numsTimesTen << num * 10
}

List newTimesTen = nums.collect {num -> num * 10}
println nums
println numsTimesTen
println newTimesTen

