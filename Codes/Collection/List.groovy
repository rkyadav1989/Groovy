def nums = [1,2,3,3,4,5,4,5,6,7,]
/*other possible declaration can be
ArrayList nums =
List nums =
 */
println nums
println nums.class.name
//groovy list is nothing but java.util.ArrayList

//add items
nums.push(99)
println nums

nums.putAt(0,82) //insert a value at index
println nums

nums[0] = 78 //access and assign another value

/*
we can also use + operator overloading or left shift << to add items to the list
 */


//remove item
def num2=[1,2,3,4,5,6,1,4,8]
num2.pop() // removing the last item of the list
println num2

num2.removeAt(1)
println num2

//access
println num2[0]
println num2.getAt(0..3)   //here we can supply ranges


//clear
/*println nums= []
println nums.clear()
either of it can be used to clear the list
*/

//flatten method used to flat the list, for example if we have list inside list then this element can be used to flattern the list
//unique method gives, unique member


/* Set : Set does not allow duplicate members
So, if we create a list as set then result list will be having only unique members
SortedSet produce same result with sorted elements
 */

def num1 = [1,2,3,3,4,5,4,5,6,7,] as LinkedList
println num1
println num1.class.name
