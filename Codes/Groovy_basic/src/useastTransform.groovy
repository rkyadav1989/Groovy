/*
def d = new Date()
def c1 = new astTransform (first: 'Rakesh', last:'Yadav', age:21, since: d, favItems: ['Books', 'Games'])
def c2 = new astTransform ('Rakesh', 'Yadav', 21, d, ['Books', 'Games'])
assert c1==c2

//if we attempt to update to property then we will get read only exception, because of immutable class
c1.first = "Monu"

*/

